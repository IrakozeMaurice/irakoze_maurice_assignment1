package com.irakozemaurice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@Column(name = "student_id")
	private int studentId;
	
	@Column(name = "password")
	private String password;
	
	public User() {}

	public User(int studentId, String password) {
		this.studentId = studentId;
		this.password = password;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [studentId=" + studentId + ", password=" + password + "]";
	}
}
