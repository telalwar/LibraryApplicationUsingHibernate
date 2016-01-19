package com.sachin.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddBookServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter pw = response.getWriter();
		int Available;
		String ForAddingBook = request.getParameter("ForAddingBook");
		String ForSearchingBook= request.getParameter("ForSearchingBook");
		if (ForSearchingBook != null && !ForSearchingBook.isEmpty()) {
			String bookName = request.getParameter("bookName");
			BookInfo_DAO obj = new BookInfo_DAO();
			List<BookInfo_Model> test=obj.searchBook(bookName);
		}
		
		
		if (ForAddingBook != null && !ForAddingBook.isEmpty()) {
		String Book_Name = request.getParameter("bookName");
		String Author = request.getParameter("author");
		String Avaivalue = request.getParameter("availability");
		if (Avaivalue.equals("yes")) {
			Available = 1;
		} else {
			Available = 0;
		}
		int Edition =Integer.parseInt(request.getParameter("edition")); 
		
		BookInfo_Model model = new BookInfo_Model();
		model.setBook_Name(Book_Name);
		model.setAuthor(Author);
		model.setAvailable(Available);
		model.setEdition(Edition);
		
		BookInfo_DAO bookDao = new BookInfo_DAO();
		try{
		bookDao.save(model);
		request.getRequestDispatcher("SearchBook.jsp").forward(request,
				 response);
		}
		catch(Exception e){
			
			System.out.println("Exception in Add book servlet");
		}
	}
	}
	
	
}
