package com.za.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ZAServlet")
public class ZAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	@EJB
	ZASessionBean zaSessionBean; 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("entering zaweb servlet doGet method");
		PrintWriter printWriter = response.getWriter();
//		out.println(zaSessionBean.zaSessionBean());
		System.out.println("entering zaweb servlet doGet method");
	}


}
