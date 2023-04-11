<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="./DetailsStu.jsp" method="post">
			<fieldset>
				<legend style="margine: auto">Student registration</legend>
				<table>
					<tr>
						<td>Name</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="text" name="email"></td>
					</tr>
					<tr>
						<td>Contact</td>
						<td><input type="text" name="contact"></td>
					</tr>
					<tr>
						<td>City</td>
						<td><input type="text" name="city"></td>
					</tr>
				</table>
			</fieldset>
			<input style="margin-top:2px;" type="submit" value="SUBMIT">
		</form>
	</div>
</body>
</html>