<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    String id=request.getParameter("id");
    String name=request.getParameter("name");
    String email=request.getParameter("email");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<form action="./EmpRegistration.jsp" method="post">
	<fieldset >
		<legend style="margin: auto" >EMP Registration</legend>
		
		<table >
			<tr>
				<td>ID</td>
				<td> <input type="number" name="id"></td>
			</tr>
			<tr>
				<td>NAME</td>
				<td> <input type="text" name="name"></td>
			</tr>
			<tr>
				<td>EMAIL</td>
				<td> <input type="email" name="email"></td>
			</tr>
		</table>
	</fieldset>
	
	<input style="margin-top:4px" type="submit" name="SUBMIT" >
	</form>
	</div>
	
	<%!
	Connection connection;
	PreparedStatement statement;
	int result;
	String url="jdbc:mysql://localhost:3306/weje3";
	String user="root";
	String password="root";
	String query;
	%>
	
	
	<%
	if(id!=null && name!=null && email!=null)
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(url, user, password);
		query="insert into emp1 values (?,?,?)";
		statement=connection.prepareStatement(query);
		statement.setString(1,id);
		statement.setString(2,name);
		statement.setString(3,email);
		result=statement.executeUpdate();
		
	} 
	%>
	
	<%
	if(result!=0){
	%>
	 <h2 align="center">
	 	<%=result%>
	 	Database updated Successfully
	 </h2>
	 <% 
	}
	%>
</body>
</html>