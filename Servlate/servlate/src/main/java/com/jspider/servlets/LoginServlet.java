package com.jspider.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")//this url pattern name has to be same in form action name
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws 
			ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		writer.println("Welcome " + username);
		writer.println("Your Password Is " + password);
	}

}
