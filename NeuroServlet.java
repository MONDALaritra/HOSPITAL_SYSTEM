package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hospital.dao.Neuro;
import com.hospital.dao.Neurodao;

/**
 * Servlet implementation class NeuroServlet
 */
@WebServlet("/NeuroServlet")
public class NeuroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NeuroServlet() {
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
		
		
		Neuro neu = new Neuro();
		
		neu.setName(name);
		neu.setEmail(email);
		neu.setPhone(phone);
		neu.setAddress(address);
		neu.setGender(gender);
		neu.setAge(age);
		
		if(Neurodao.addPatient(neu)) {
			response.sendRedirect("neuro.jsp?appointment=success");
			
		}else {
			
			response.sendRedirect("neuro.jsp?error=1");
		}
	}

}
