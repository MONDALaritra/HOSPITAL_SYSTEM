package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hospital.dao.Plastic;
import com.hospital.dao.Plasticdao;

/**
 * Servlet implementation class PlasticServlet
 */
@WebServlet("/PlasticServlet")
public class PlasticServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlasticServlet() {
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
		
		
		Plastic pl = new Plastic();
		
		pl.setName(name);
		pl.setEmail(email);
		pl.setPhone(phone);
		pl.setAddress(address);
		pl.setGender(gender);
		pl.setAge(age);
		
		if(Plasticdao.addPatient(pl)) {
			response.sendRedirect("plasctic.jsp?appointment=success");
			
		}else {
			
			response.sendRedirect("plasctic.jsp?error=1");
		}
	}

}
