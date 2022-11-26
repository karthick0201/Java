<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Profile</title>
</head>
<body>
	<%
	//CLICK BACK BUTTTON ---> BACK TO LOGOUT PAGE THEN AVOID .... BELOW 3 LINE CODE NEED!!!
	response.setHeader("cache-Control","no-cache,no-store,must-revalidate"); // Http 1.1

	response.setHeader("pragma","no-cache"); //Http 1.0
	
	response.setHeader("Expires","0"); //proxies
	
	System.out.println("checking1 : " + session.getAttribute("s_u_name"));
	if(session.getAttribute("s_u_name")==null){
		response.sendRedirect("index.jsp");
	}
	%>
	Welcome ${s_u_name}
	<h2>CUSTOMER PROFILE</h2>
	<a href="front_customer_profile.jsp">Click (PROFILE) Here!!!</a>

	<form>
		<!-- action="" method="" -->

		<p>Location :</p>
		<input type="text" name='s_location'>
		<p>From Date :</p>
		<input type="date" name='s_from_date'>
		<p>To Date :</p>
		<input type="date" name='s_to_date'>
		<p>From Time :</p>
		<input type="time" name='s_from_time'>
		<p>To Time :</p> 
		<input type="time" name='s_to_time'> 
		<br> 
		<input type='submit' value='Search'>

	</form>
	
	<form action="LogoutServlet" method="get" style="float: right">
		 <input type="submit" value="Logout">
		 </form>
	<div>
	Promotion Content!!!
	Location : Right Side Place -Box
	</div>



</body>
</html>