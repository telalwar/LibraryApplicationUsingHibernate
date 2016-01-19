package com.sachin.project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Librarian_Servlet
 */
@WebServlet("/Librarian_Servlet")
public class Librarian_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Librarian_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String strLastName = request.getParameter("lname");
		String strFirstName = request.getParameter("fname");
		String strUserName = request.getParameter("userName");
		String strEmailId = request.getParameter("emailaddr");
		String strPass = request.getParameter("accpwdone");
		String strPassTwo = request.getParameter("accpwdtwo");
		//response.getOutputStream().write(strFirstName.getBytes());
		Librarian_Model model = new Librarian_Model();
		model.setLastName(strLastName);
		model.setFirstName(strFirstName);
		model.setLibrarian_UserName(strUserName);
		model.setEmail(strEmailId);
		model.setPass(strPass);
		model.setPassTwo(strPassTwo);
		Librarian_DAO librarian = new Librarian_DAO();
		librarian.save(model);
		response.sendRedirect("Login.jsp");
	}

}
