package com.StudentsManagementSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "fullname")
	private String fullName;
	@Column(name = "email")
	private String email;
	@Column(name = "gender")
	private String gender;
	@Column(name = "contactNumber")
	private String contactNumber;
	@Column(name = "dept")
	private String department;
	@Column(name = "designation")
	private String designation;
	@Column(name = "subject_assigned")
	private String subject_assigned;
	@Column(name = "class_assigned")
	private String class_assigned;

	public String getClass_assigned() {
		return class_assigned;
	}

	public void setClass_assigned(String class_assigned) {
		this.class_assigned = class_assigned;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSubject_assigned() {
		return subject_assigned;
	}

	public void setSubject_assigned(String subject_assigned) {
		this.subject_assigned = subject_assigned;
	}

	public Teacher(int id, String fullName, String email, String gender, String contactNumber, String department,
			String designation, String subject_assigned, String class_assigned) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.department = department;
		this.designation = designation;
		this.subject_assigned = subject_assigned;
		this.class_assigned = class_assigned;
	}

	public Teacher() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
}
