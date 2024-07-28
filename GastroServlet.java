package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hospital.dao.Gastodao;
import com.hospital.dao.Gastro;

/**
 * Servlet implementation class GastroServlet
 */
@WebServlet("/GastroServlet")
public class GastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GastroServlet() {
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
		
		
		Gastro gas = new Gastro();
		
		gas.setName(name);
		gas.setEmail(email);
		gas.setPhone(phone);
		gas.setAddress(address);
		gas.setGender(gender);
		gas.setAge(age);
		
		if(Gastodao.addPatient(gas)) {
			response.sendRedirect("gastro.jsp?appointment=success");
			
		}else {
			
			response.sendRedirect("gastro.jsp?error=1");
		}
	}

}
