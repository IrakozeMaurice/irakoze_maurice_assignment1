package com.irakozemaurice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.irakozemaurice.dao.StudentDao;
import com.irakozemaurice.dao.UserDao;
import com.irakozemaurice.model.Student;
import com.irakozemaurice.model.User;

@WebServlet(name = "RegisterController", urlPatterns = "/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// create a user account
		User user = new User(Integer.parseInt(request.getParameter("student_id")),request.getParameter("password"));
		
		// create a student
		Student student = new Student(Integer.parseInt(request.getParameter("student_id")),request.getParameter("firstname"),request.getParameter("lastname"),request.getParameter("faculty"),request.getParameter("department"),request.getParameter("address"),request.getParameter("phone_number"),request.getParameter("email"));
		student.setUser(user);
		
		// persist data
		UserDao userDao = new UserDao();
		userDao.save(user);
		
		StudentDao studentDao = new StudentDao();
		studentDao.save(student);
		
//		getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);
		response.sendRedirect("/home");
		
//		System.out.println(request.getParameter("student_id"));
//		System.out.println(request.getParameter("firstname"));
//		System.out.println(request.getParameter("lastname"));
//		System.out.println(request.getParameter("address"));
//		System.out.println(request.getParameter("faculty"));
//		System.out.println(request.getParameter("address"));
//		System.out.println(request.getParameter("phone_number"));
//		System.out.println(request.getParameter("email"));
//		System.out.println(request.getParameter("password"));
//		System.out.println(request.getParameter("confirm_password"));
	}
}
