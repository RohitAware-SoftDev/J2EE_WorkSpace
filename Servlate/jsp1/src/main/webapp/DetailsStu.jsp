<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
String name=request.getParameter("name");
String email=request.getParameter("email");
String contact=request.getParameter("contact");
String city=request.getParameter("city");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details of Student</title>
</head>
<body>
	<div align="center">
		<fieldset>
			<legend style="margin:auto">Student Details</legend>
			<table>
				<tr>
					<td>Name</td>
					<td><%=name %></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><%= email%></td>
				</tr>
				<tr>
					<td>Contact</td>
					<td><%= contact%></td>
				</tr>
				<tr>
					<td>City</td>
					<td><%=city %></td>
				</tr>
				
			</table>
		</fieldset>
	</div>
</body>
</html>