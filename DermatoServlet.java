package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hospital.dao.Dermato;
import com.hospital.dao.Dermatodao;

/**
 * Servlet implementation class DermatoServlet
 */
@WebServlet("/DermatoServlet")
public class DermatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DermatoServlet() {
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
		
		
		Dermato da = new Dermato();
		
		da.setName(name);
		da.setEmail(email);
		da.setPhone(phone);
		da.setAddress(address);
		da.setGender(gender);
		da.setAge(age);
		
		if(Dermatodao.addPatient(da)) {
			response.sendRedirect("dermatoappointment.jsp?appointment=success");
			
		}else {
			
			response.sendRedirect("dermatoappointment.jsp?error=1");
		}
	}

}
