package com.sachin.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Librarian")
public class Librarian_Model {
	@Id
	@GeneratedValue
	@Column(name = "Librarian_id")
	private int LibrarianId;

	public int getLibrarianId() {
		return LibrarianId;
	}

	public void setLibrarianId(int librarianId) {
		LibrarianId = librarianId;
	}

	private String FirstName;
	private String LastName;
	private String Email;
	private String Pass;
	private String PassTwo;
	private String Librarian_UserName;

	public String getLibrarian_UserName() {
		return Librarian_UserName;
	}

	public void setLibrarian_UserName(String librarian_UserName) {
		Librarian_UserName = librarian_UserName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPass() {
		return Pass;
	}

	public void setPass(String pass) {
		Pass = pass;
	}

	public String getPassTwo() {
		return PassTwo;
	}

	public void setPassTwo(String passTwo) {
		PassTwo = passTwo;
	}

}
