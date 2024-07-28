package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.hospital.dao.Userdao;

/**
 * Servlet implementation class UserloginServlet
 */
@WebServlet("/UserloginServlet")
public class UserloginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Userdao userdao = new Userdao();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserloginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		 if(userdao.isValidUser(email,password)) {
			 HttpSession session = request.getSession();
			 session.setAttribute("email",email);
			 response.sendRedirect("userwelcome.jsp");
			/* Cookie c = new Cookie("email",email);
			 response.addCookie(c);*/
			 
		 }
		 else {
			 response.sendRedirect("userlogin.jsp?error=1");
			 System.out.println("this is a error");
		 }
	}

}
