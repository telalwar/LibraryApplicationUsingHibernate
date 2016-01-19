package com.sachin.project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LibraryServlet
 */
@WebServlet("/LibraryServlet")
public class LibraryServlet extends HttpServlet {
	// private static SessionFactory factory;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LibraryServlet() {
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
		String strLastName = request.getParameter("lname");
		String strFirstName = request.getParameter("fname");
		String strUserID = request.getParameter("userid");
		String strEmailId = request.getParameter("emailaddr");
		String strDepart = request.getParameter("department");
		String strPass = request.getParameter("accpwdone");
		String strPassTwo = request.getParameter("accpwdtwo");
		String strContact = request.getParameter("contact");
		response.getOutputStream().write(strEmailId.getBytes());
		Student_Model studObj = new Student_Model();
		studObj.setStrLastName(strLastName);
		studObj.setStrFirstName(strFirstName);
		studObj.setStrUserName(strUserID);
		studObj.setStrEmailId(strEmailId);
		studObj.setStrDepartment(strDepart);
		studObj.setStrPassword(strPass);
		studObj.setStrPasswordTwo(strPassTwo);
		studObj.setStrContact(strContact);
		

		Student_DAO test = new Student_DAO();
		test.save(studObj);
		response.sendRedirect("Login.jsp");

	}

}
