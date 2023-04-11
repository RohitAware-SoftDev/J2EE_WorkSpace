package com.jspider.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet1 extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("Hello");	
//		 IF You run the code only with doPost() method code wont work
//		you need to call this method so we create the doGet() method 
//		which get called automatically automatically so inside this method we call doPost() method
	}

	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) 
			throws ServletException, IOException {
	
		this.doPost(req, resp);
	}
	
	
}
