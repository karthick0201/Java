<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>

<h1>VEHICLE RENTAL AGENCY</h1>
<h3>Registration</h3>
	
	<form method="post" action="RegisterServlet">
		<table>
			<tr>
				<td>Name :</td>
				<td><input type="text" id="c_name" name="c_name"></td>
			</tr>
			<tr>
				<td>User Name : </td>
				<td><input type="text" id="c_uname" name="c_uname"></td>
			</tr>
			<tr>
				<td>Password : </td>
				<td><input type="password" id="c_psw" name="c_psw"></td>
			</tr>
			<tr>
				<td>Phone No :</td>
				<td><input type="number" id="c_phno" name="c_phno"></td>
			</tr>
			<tr>
				<td>Email Id : </td>
				<td><input type="email" id="c_email" name="c_email"></td>
			</tr>
 			<tr>
				<td>Select :</td>
				<td><input type="radio" name="type" value="citizen" /><label>Citizen</label></td>
				<td><input type="radio" name="type" value="organization" /><label>Organization</label></td>
			</tr> 
		</table>
		<button  id="submit">SUBMIT</button> 
		

	</form>
	<a href="index.jsp">Back to Login</a>
	
	<!-- <script src="NewRegisterJS.js"></script> -->
</body>
</html>