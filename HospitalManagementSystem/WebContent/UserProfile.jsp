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
	<td><a href="CheckUpDetails.jsp" >Check-Up Details &nbsp </a>
	<!-- <form method="post" action="PatientDetails.jsp">
	<input type="submit" value="checkup">
	</form> -->
	</td>
	<td><a href="PatientDetails.jsp">Patient-Details &nbsp</a></td>
	<td><a href="welcome.jsp">LogouT &nbsp</a></td>
	</tr>
	</table>
	
	<form method="post" action="SummaryServlet">
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