package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hospital.dao.Anesthesia;
import com.hospital.dao.Anesthesiadao;

/**
 * Servlet implementation class AnesthesiaServlet
 */
@WebServlet("/AnesthesiaServlet")
public class AnesthesiaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnesthesiaServlet() {
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
		
		
		Anesthesia an = new Anesthesia();
		
		an.setName(name);
		an.setEmail(email);
		an.setPhone(phone);
		an.setAddress(address);
		an.setGender(gender);
		an.setAge(age);
		
		if(Anesthesiadao.addPatient(an)) {
			response.sendRedirect("annesthesiaappointment.jsp?appointment=success");
			
		}else {
			
			response.sendRedirect("annesthesiaappointment.jsp?error=1");
		}
	}

}
