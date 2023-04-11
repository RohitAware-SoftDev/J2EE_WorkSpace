package com.jspider.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Registration")
public class RegistrationServlet extends HttpServlet {
	

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String name=request.getParameter("name");
//		String skills=request.getParameter("skills");
//		getParameter() method will store only one value ...means line number 26 will print only 1st selected checkBox skills value 
		writer.println("Hello "+name);
		String[] skills = request.getParameterValues("skills");
		writer.println("Your skills are : ");
		for (String skill : skills) {
			writer.println(skill);
		}
	}

}
