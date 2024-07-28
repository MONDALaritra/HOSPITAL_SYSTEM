package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospital.dao.Allergy;
import com.hospital.dao.Allergydao;


/**
 * Servlet implementation class AllergyServlet
 */
@WebServlet("/AllergyServlet")
public class AllergyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllergyServlet() {
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
		
		
		Allergy allergy = new Allergy();
		
		allergy.setName(name);
		allergy.setEmail(email);
		allergy.setPhone(phone);
		allergy.setAddress(address);
		allergy.setGender(gender);
		allergy.setAge(age);
		
		if(Allergydao.addPatient(allergy)) {
			response.sendRedirect("allergyappointment.jsp?appointment=success");
			
		}else {
			
			response.sendRedirect("allergyappointment.jsp?error=1");
		}
	}

}
