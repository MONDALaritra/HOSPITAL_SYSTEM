package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospital.dao.Heart;
import com.hospital.dao.Heartdao;


/**
 * Servlet implementation class HeartServlet
 */
@WebServlet("/HeartServlet")
public class HeartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HeartServlet() {
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
		
		
		Heart heart = new Heart();
		
		heart.setName(name);
		heart.setEmail(email);
		heart.setPhone(phone);
		heart.setAddress(address);
		heart.setGender(gender);
		heart.setAge(age);
		
		if(Heartdao.addPatient(heart)) {
			response.sendRedirect("heartappointment.jsp?appointment=success");
			System.out.println("succeeded");
		}else {
			System.out.println("failed");
			response.sendRedirect("heartappointment.jsp?error=1");
		}
	}

}
