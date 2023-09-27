package com.irakozemaurice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.irakozemaurice.dao.UserDao;
import com.irakozemaurice.model.User;

@WebServlet(name = "ForgotPasswordController", urlPatterns = "/forgot")
public class ForgotPasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserDao userDao = new UserDao();
		User user = userDao.getById(Integer.parseInt(request.getParameter("student_id")));
		if(user != null) {
			user.setPassword(request.getParameter("password"));
			userDao.update(user);
//			getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);
			response.sendRedirect("/home");
		}
	}
}
