package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hospital.dao.Hemato;
import com.hospital.dao.Hematodao;

/**
 * Servlet implementation class HematoServlet
 */
@WebServlet("/HematoServlet")
public class HematoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HematoServlet() {
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
		
		
		Hemato hem = new Hemato();
		
		hem.setName(name);
		hem.setEmail(email);
		hem.setPhone(phone);
		hem.setAddress(address);
		hem.setGender(gender);
		hem.setAge(age);
		
		if(Hematodao.addPatient(hem)) {
			response.sendRedirect("hemato.jsp?appointment=success");
			
		}else {
			
			response.sendRedirect("hemato.jsp?error=1");
		}
	}

}
