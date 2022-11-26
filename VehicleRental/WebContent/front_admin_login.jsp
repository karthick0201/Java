<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/style/index.css">
<!-- ---------This text add only css work----------------------
${pageContext.request.contextPath}/ <-- BEFORE CSS
 --------------------------------------------------------->
</head>
<body>
<%

	response.setHeader("cache-Control","no-cache,no-store,must-revalidate"); // Http 1.1

	response.setHeader("pragma","no-cache"); //Http 1.0
	
	response.setHeader("Expires","0"); //proxies
	
	
	System.out.println("checking1 : " + session.getAttribute("s_u_name"));
	if(session.getAttribute("s_u_name")==null){
		response.sendRedirect("index.jsp");
		
	}
	%>
	<!--  >form action="LoginServlet" method="get">
	<input type="submit" value="Logout">
	</form-->
	<h2 align="center">Car Rental Agency</h2>
	<div class="topnav">
		<a class="active" href="#profile">Profile</a>
		<div class="dropdown">
		<button class="dropbutton">Vehicle</button>
		<div class="dropdown-content">
		 <a href="addVehicle.jsp">ADD Vehicle</a> 
		 <a href="#VIEW vehicle">VIEW Vehicle</a> 
		 <!-- <a href="#delete vehicle">DELETE Vehicle</a> -->
		</div>
		 </div>  
		 <!------------------  -->
		 <div class="dropdown">
		<button class="dropbutton">Records</button>
		<div class="dropdown-content">
		 <a href="#BookedVehicleDetails">BooKED Vehicle Details</a> 
		 <a href="#Customer Details">CustomeR DetailS</a> 
		 </div>
		 </div>
		 <!-- <a class="active" href="#changeStatus">Change Status</a> -->
		 <!----------------------->
		 <!--  a href="index.jsp" style="float: right">--> 
		 <form action="LogoutServlet" method="get" style="float: right">
		 <input type="submit" value="Logout">
		 </form>
	</div>
</body>
</html>