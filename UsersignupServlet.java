package com.hospital.servlet;

import com.hospital.dao.User;
import com.hospital.dao.Userdao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class UsersignupServlet
 */
@WebServlet("/UsersignupServlet")
public class UsersignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Userdao userdao = new Userdao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		
		User user = new User();
		
		user.setName(name);
		user.setEmail(email);
		user.setPhone(phone);
		user.setAddress(address);
		user.setPassword(password);
		
		if(userdao.addUser(user)) {
			response.sendRedirect("usersignup.jsp?registration=success");
			
		}else {
				
			response.sendRedirect("usersignup.jsp?error=1");
		}
	}

}
