package com.sachin.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServlet() {
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

		// response.getOutputStream().write(strPass.getBytes());

		String bolLib = request.getParameter("Forlibrarian");
		String bolStud = request.getParameter("ForStudnets");
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");

		if (bolLib != null && !bolLib.isEmpty()) {
			String strLibrarianName = request.getParameter("username");
			String strLibPass = request.getParameter("pass");
			Librarian_DAO librarian = new Librarian_DAO();
			boolean bol = librarian.checkUser(strLibrarianName, strLibPass);
			if (bol) {
				pw.println("Welcome " + strLibrarianName);
				request.getRequestDispatcher("AddBook.jsp").forward(request,
				 response);
			} else {
				pw.println("Please enter valid UserName or Password");
			}
		}

		if (bolStud != null && !bolStud.isEmpty()) {
			String strUserName = request.getParameter("username");
			String strPass = request.getParameter("pass");
			Student_DAO stud = new Student_DAO();
			boolean bol = stud.checkUser(strUserName, strPass);
			if (bol) {
				pw.println("Welcome " + strUserName);
			} else {
				pw.println("Please enter valid UserName or Password");
			}
		}
	}

}
