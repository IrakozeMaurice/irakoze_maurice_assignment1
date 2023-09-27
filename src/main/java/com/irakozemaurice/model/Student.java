package com.irakozemaurice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@Column(name = "student_id")
	private int studentId;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "faculty")
	private String faculty;

	@Column(name = "department")
	private String department;

	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private String phone;

	@Column(name = "email")
	private String email;

	public Student() {
	}

	public Student(int studentId, String firstname, String lastname, String faculty, String department, String address,
			String phone, String email) {
		this.studentId = studentId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.faculty = faculty;
		this.department = department;
		this.phone = phone;
		this.email = email;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstname=" + firstname + ", lastname=" + lastname + ", faculty="
				+ faculty + ", department=" + department + ", address=" + address + ", phone=" + phone + ", email="
				+ email + "]";
	}

	
}
