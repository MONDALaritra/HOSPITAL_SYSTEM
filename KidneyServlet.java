package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospital.dao.Kidney;
import com.hospital.dao.Kidneydao;



/**
 * Servlet implementation class KidneyServlet
 */
@WebServlet("/KidneyServlet")
public class KidneyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KidneyServlet() {
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
		
		
		Kidney kidney = new Kidney();
		
		kidney.setName(name);
		kidney.setEmail(email);
		kidney.setPhone(phone);
		kidney.setAddress(address);
		kidney.setGender(gender);
		kidney.setAge(age);
		
		if(Kidneydao.addPatient(kidney)) {
			response.sendRedirect("kidneyappointment.jsp?appointment=success");
			System.out.println("succeeded");
		}else {
			System.out.println("failed");
			response.sendRedirect("kidneyappointment.jsp?error=1");
		}
	}

}
