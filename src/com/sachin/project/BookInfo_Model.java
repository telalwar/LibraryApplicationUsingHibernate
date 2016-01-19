package com.sachin.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book_Info")
public class BookInfo_Model {

	@Id
	@GeneratedValue
	@Column(name = "Book_id")
	private int Book_id;
	private String Book_Name;
	private String Author;
	private int Available;
	private int Edition;
	public int getBook_id() {
		return Book_id;
	}
	public void setBook_id(int book_id) {
		Book_id = book_id;
	}
	public String getBook_Name() {
		return Book_Name;
	}
	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getAvailable() {
		return Available;
	}
	public void setAvailable(int available) {
		Available = available;
	}
	public int getEdition() {
		return Edition;
	}
	public void setEdition(int edition) {
		Edition = edition;
	}
	
}
