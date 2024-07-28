package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hospital.dao.Admindao;

/**
 * Servlet implementation class AdminloginServlet
 */
@WebServlet("/AdminloginServlet")
public class AdminloginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static Admindao admindao = new Admindao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminloginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		 if(admindao.isValidAdmin(email,password)) {
			 HttpSession session = request.getSession();
			 session.setAttribute("email",email);
			 response.sendRedirect("index.jsp");
			 
		 }
		 else {
			 response.sendRedirect("administrationlogin.jsp?error=1");
			 System.out.println("this is a error");
		 }
	}

}
