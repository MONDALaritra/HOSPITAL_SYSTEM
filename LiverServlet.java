package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hospital.dao.Liver;
import com.hospital.dao.Liverdao;

/**
 * Servlet implementation class LiverServlet
 */
@WebServlet("/LiverServlet")
public class LiverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LiverServlet() {
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
		
		
		Liver liver = new Liver();
		
		liver.setName(name);
		liver.setEmail(email);
		liver.setPhone(phone);
		liver.setAddress(address);
		liver.setGender(gender);
		liver.setAge(age);
		
		if(Liverdao.addPatient(liver)) {
			response.sendRedirect("liverappointment.jsp?appointment=success");
			
		}else {
			
			response.sendRedirect("liverappointment.jsp?error=1");
		}
	}

}
