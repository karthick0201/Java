<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
<h1>HOSPITAL MANAGEMENT SYSTEM</h1>
<h3>Patient Registation</h3>
	<form method="post" action="RegisterServlet">
		<table>
			<tr>
				<td>Name :</td>
				<td><input type="text" id="p_name" name="pname"></td>
			</tr>
			<tr>
				<td>Phone No :</td>
				<td><input type="text" id="p_number" name="pnumber"></td>
			</tr>
 			<tr>
				<td>Blood Group : </td>
				<td><input type="text" id="in_time"></td>
			</tr>
			<tr>
				<td>Enter Your City  :</td>
				<td><input type="text" id="doctor_time"></td>
			</tr> 
		</table>
		<button  id="submit">SUBMIT</button> 
		

	</form>
	<a href="login.jsp">Back to Login</a>
	
	<script src="NewRegisterJS.js"></script>
</body>
</html>