<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tag Demo Page</title>
</head>
<body>
	<%!List<Integer> list= new ArrayList(); %>
	<%
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	%>
	
	<%
	for(Integer in :list){
	%>
	<h1><%=in%></h1>
	<%
	}
	%>
	
</body>
</html>