package com.hospital.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospital.dao.General;
import com.hospital.dao.Generaldao;


/**
 * Servlet implementation class GeneralServlet
 */
@WebServlet("/GeneralServlet")
public class GeneralServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GeneralServlet() {
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
		
		
		General general = new General();
		
		general.setName(name);
		general.setEmail(email);
		general.setPhone(phone);
		general.setAddress(address);
		general.setGender(gender);
		general.setAge(age);
		
		if(Generaldao.addPatient(general)) {
			response.sendRedirect("generalAppointment.jsp?appointment=success");
			System.out.println("succeeded");
		}else {
			System.out.println("failed");
			response.sendRedirect("generalAppointment.jsp?error=1");
		}
	}

}
