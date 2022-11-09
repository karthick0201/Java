<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hospital</title>
</head>
<body>
<h1>HOSPITAL MANAGEMENT SYSTEM</h1>
	<form method="post" action="LoginServlet">
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
				<td>In Time :</td>
				<td><input type="text" id="in_time" name="intime"></td>
			</tr>
			<tr>
				<td>Doctor Time :</td>
				<td><input type="text" id="doctor_time"  name="docTime"></td>
			</tr>
		</table>
		<button  id="submit">SUBMIT</button>
		

	</form>
	<a href="login.jsp">Back to Login</a>
	
	<script src="NewRegisterJS.js"></script>
</body>
</html>