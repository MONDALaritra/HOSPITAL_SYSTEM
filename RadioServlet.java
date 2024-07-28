package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hospital.dao.Radio;
import com.hospital.dao.Radiodao;

/**
 * Servlet implementation class RadioServlet
 */
@WebServlet("/RadioServlet")
public class RadioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RadioServlet() {
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
		
		
		Radio rad = new Radio();
		
		rad.setName(name);
		rad.setEmail(email);
		rad.setPhone(phone);
		rad.setAddress(address);
		rad.setGender(gender);
		rad.setAge(age);
		
		if(Radiodao.addPatient(rad)) {
			response.sendRedirect("radiology.jsp?appointment=success");
			
		}else {
			
			response.sendRedirect("radiology.jsp?error=1");
		}
	}

}
