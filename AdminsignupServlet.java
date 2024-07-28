package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospital.dao.Admin;
import com.hospital.dao.Admindao;


/**
 * Servlet implementation class AdminsignupServlet
 */
@WebServlet("/AdminsignupServlet")
public class AdminsignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static Admindao admindao = new Admindao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminsignupServlet() {
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
		
		Admin admin = new Admin();
		
		admin.setName(name);
		admin.setEmail(email);
		admin.setPhone(phone);
		admin.setAddress(address);
		admin.setPassword(password);
		
		if(admindao.addAdmin(admin)) {
			response.sendRedirect("administrationlogin.jsp?registration=success");
			System.out.println("succeeded");
		}else {
				
			response.sendRedirect("adminsignup.jsp?error=1");
		}
	}

}
