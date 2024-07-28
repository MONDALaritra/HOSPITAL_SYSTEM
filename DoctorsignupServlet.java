package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospital.dao.Doctor;
import com.hospital.dao.Doctordao;


/**
 * Servlet implementation class DoctorsignupServlet
 */
@WebServlet("/DoctorsignupServlet")
public class DoctorsignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static Doctordao doctordao = new Doctordao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorsignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String specialist = request.getParameter("specialist");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		
		Doctor doctor = new Doctor();
		
		doctor.setName(name);
		doctor.setEmail(email);
		doctor.setPhone(phone);
		doctor.setSpecialist(specialist);
		doctor.setAddress(address);
		doctor.setPassword(password);
		
		if(doctordao.addDoctor(doctor)) {
			response.sendRedirect("doctorlogin.jsp?registration=success");
			System.out.println("succeeded");
		}else {
				
			response.sendRedirect("doctor-signup.jsp?error=1");
		}
	}

}
