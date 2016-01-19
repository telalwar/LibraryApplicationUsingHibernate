package com.sachin.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "STUDENTS",uniqueConstraints = {@UniqueConstraint(columnNames={"username"})})
public class Student_Model {
	@Id @GeneratedValue
	@Column(name = "Library_id")
	private int LibraryId;
	public int getLibraryId() {
		return LibraryId;
	}
	public void setLibraryId(int libraryId) {
		LibraryId = libraryId;
	}
	@Column(name = "username")
	private String strUserName;
	private String strLastName;
	private String strFirstName;
	private String strPassword;
	private String strContact;
	private String strPasswordTwo;
	public String getStrPasswordTwo() {
		return strPasswordTwo;
	}
	public void setStrPasswordTwo(String strPasswordTwo) {
		this.strPasswordTwo = strPasswordTwo;
	}
	public String getStrUserName() {
		return strUserName;
	}
	public void setStrUserName(String strUserName) {
		this.strUserName = strUserName;
	}
	public String getStrLastName() {
		return strLastName;
	}
	public void setStrLastName(String strLastName) {
		this.strLastName = strLastName;
	}
	public String getStrFirstName() {
		return strFirstName;
	}
	public void setStrFirstName(String strFirstName) {
		this.strFirstName = strFirstName;
	}
	public String getStrPassword() {
		return strPassword;
	}
	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}
	public String getStrContact() {
		return strContact;
	}
	public void setStrContact(String strContact) {
		this.strContact = strContact;
	}
	public String getStrEmailId() {
		return strEmailId;
	}
	public void setStrEmailId(String strEmailId) {
		this.strEmailId = strEmailId;
	}
	public String getStrDepartment() {
		return strDepartment;
	}
	public void setStrDepartment(String strDepartment) {
		this.strDepartment = strDepartment;
	}
	private String strEmailId;
	private String strDepartment;
}
