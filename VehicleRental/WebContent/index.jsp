<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>

<link rel="stylesheet" href="${pageContext.request.contextPath}/style/index.css">
</head>
<body>
	<h2 align="center">Car Rental Agency</h2>
	<!---------------------Nav bar---------------------------->
	<ul>
	<li><a href="index.jsp">Home</a></li>
	<li><a href="#">Service By City</a></li>
	<li><a href="#">Cars & Tariffs</a></li>
	<li><a href="#">About Us</a></li>
	<li><a href="#">Contact Us</a></li>
	</ul>
	
	<div >${message}</div>
	<div class="form1">
	<form method="post" action="LoginServlet">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="u_name"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="psw"></td>
			</tr>
		</table>
		<input type="submit" value="Login">
	</form>
	<a href="register.jsp">New Register</a>
	</div>
</body>
</html>