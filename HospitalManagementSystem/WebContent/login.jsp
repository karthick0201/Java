<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN PAGE</title>
</head>
<body>
<h1>HOSPITAL MANAGEMENT SYSTEM</h1>
	
	<form method="post" action="LoginServlet">
		<table>
			<tr>
				<td>Id :</td>
				<td><input type="text" id='p_id' name='p_id'>
			</tr>
			<tr>
				<td>Phone Number :</td>
				<td><input type="text" id='p_phoneno' name='p_phoneno'></td>
			</tr>
		</table>

		<input type="submit" value='Submit'>
	</form>
	<a href="NewRegister.jsp">New Register</a>
</body>
</html>