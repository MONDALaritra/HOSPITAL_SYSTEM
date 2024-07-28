package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hospital.dao.Psycho;
import com.hospital.dao.Psychodao;

/**
 * Servlet implementation class PsychoServlet
 */
@WebServlet("/PsychoServlet")
public class PsychoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PsychoServlet() {
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
		
		
		Psycho ps = new Psycho();
		
		ps.setName(name);
		ps.setEmail(email);
		ps.setPhone(phone);
		ps.setAddress(address);
		ps.setGender(gender);
		ps.setAge(age);
		
		if(Psychodao.addPatient(ps)) {
			response.sendRedirect("psycho.jsp?appointment=success");
			
		}else {
			
			response.sendRedirect("psycho.jsp?error=1");
		}
	}

}
