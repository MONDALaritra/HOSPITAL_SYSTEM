package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospital.dao.Eye;
import com.hospital.dao.Eyedao;


/**
 * Servlet implementation class EyeServlet
 */
@WebServlet("/EyeServlet")
public class EyeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EyeServlet() {
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
		
		
		Eye eye = new Eye();
		
		eye.setName(name);
		eye.setEmail(email);
		eye.setPhone(phone);
		eye.setAddress(address);
		eye.setGender(gender);
		eye.setAge(age);
		
		if(Eyedao.addPatient(eye)) {
			response.sendRedirect("eyeappointment.jsp?appointment=success");
			System.out.println("succeeded");
		}else {
			System.out.println("failed");
			response.sendRedirect("eyeappointment.jsp?error=1");
		}
	}

}
