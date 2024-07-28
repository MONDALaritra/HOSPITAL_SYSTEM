package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hospital.dao.Onco;
import com.hospital.dao.Oncodao;

/**
 * Servlet implementation class OncoServlet
 */
@WebServlet("/OncoServlet")
public class OncoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OncoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		
		
		Onco on = new Onco();
		
		on.setName(name);
		on.setEmail(email);
		on.setPhone(phone);
		on.setAddress(address);
		on.setGender(gender);
		on.setAge(age);
		
		if(Oncodao.addPatient(on)) {
			response.sendRedirect("onco.jsp?appointment=success");
			
		}else {
			
			response.sendRedirect("onco.jsp?error=1");
		}
	}

}
