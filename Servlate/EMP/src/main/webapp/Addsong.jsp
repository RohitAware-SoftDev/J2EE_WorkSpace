<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.mysql.cj.xdevapi.PreparableStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String no = request.getParameter("no");
String name = request.getParameter("name");
String singer = request.getParameter("singer");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD SONG</title>
</head>
<body>
	<div align="center">
		<form action="./Addsong.jsp" method="post">
			<fieldset>
				<legend style="margin: auto;">ADD SONG TO FOLDER</legend>
				<table>
					<tr>
						<td>No</td>
						<td><input type="number" name="no"></td>
					</tr>
					<tr>
						<td>Song Name</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td>Singer</td>
						<td><input type="text" name="singer"></td>
					</tr>
				</table>
			</fieldset>

			<input style="margin-top: 4px" type="submit" name="SUBMIT">
		</form>
	</div>

	<%!Connection connection;
	PreparedStatement statement;
	String url = "jdbc:mysql://localhost:3306/weje3";
	String user = "root";
	String password = "root";
	String query;
	int result;%>

	<%
	if(no!=null && name!=null && singer!=null)
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	connection = DriverManager.getConnection(url, user, password);
	query = "insert into song values (?,?,?);";
	statement.setString(1, "1");
	statement.setString(2, "Kesariya");
	statement.setString(3, "Arjit Singh");
	statement.executeUpdate();
	}
	%>
	
	<%
	if(result!=0){
	%>
	<h2 align="center">
		song Added Successfully
	</h2>
	<%
	}
	%>
</body>
</html>