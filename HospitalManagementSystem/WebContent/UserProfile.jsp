<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body >
	<h2>USER PROFILE</h2> <br>
	<table>
	<tr>
	<td><a href="#">Check-Up Details &nbsp </a></td>
	<td><a href="#">Patient-Details &nbsp</a></td>
	<td><a href="welcome.jsp">LogouT &nbsp</a></td>
	</tr>
	</table>
	
	<form method="get" action="">
		<table>
			<tr>
				<td>Enter-In-Time :</td>
				<td><input type="text" name="in_time"></td>
			</tr>
			<tr>
				<td>Enter_Doc_time :</td>
				<td><input type="text" name="doc_time"></td>
			</tr>
		</table>

		<input type="submit" value='Submit'>
	</form>



</body>
</html>