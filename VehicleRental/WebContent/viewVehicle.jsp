<!----------------------NEW CONCEPT  ----------------------------><!--  
1. USING <a href tag > --call servlet annoaton file wit parameter(Defaule get)
2. Form action : we pass post method ku parameter la value pass pannalam


--><!---------------------------------------------------------------->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!------------------IMPORT CLASSES: ---------------->
<%@ page import="java.sql.*"%>
<%@ page import="DAO.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VIEW VEHICLE DETAILS</title>
</head>
<body>
	<h2>View Vehicles</h2>

	<%
		String query = "SELECT * FROM vehicle_rental.vehicle";
		Connection con = VehicleDAO.initializeDatabase();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		//String car_id, car_name, car_num, car_model_no, car_type, car_seat_count, car_price_per_day, car_description, car_status, car_photo;
		//ITERATE DATABASE:
		int count = 0;
		while (rs.next()) {
			//String path=VehicleDAO.photoPath + rs.getString("car_photo");
			String path = "images/" + rs.getString("car_photo");
			count++;
	%>
	<div>

		<form action="editVehicle.jsp?car_id=<%=rs.getString("car_id")%>"
			method="post">
			<table cellpadding="3" cellspacing="2" border="0">
				<tr>
					<th>Status :</th>
					<td><%=rs.getString("car_status")%></td>
				</tr>
				<tr>
					<td><img src="<%=path%>" height="240" width="300" style="text-align: center"></td> 

				</tr>
				<tr>
					<th>Car Name :</th>
					<td><%=rs.getString("car_name")%></td>
				</tr>
				<tr>
					<th>Car Model No :</th>
					<td><%=rs.getString("car_model_no")%></td>
				</tr>
				<tr>
					<th>Seats :</th>
					<td><%=rs.getInt("car_seat_count")%></td>
				</tr>
				<tr>
					<th>Price Per Day :</th>
					<td><%=rs.getInt("car_price_per_day")%></td>
				</tr>
				<tr>
					<th>Car Number :</th>
					<td><%=rs.getString("car_num")%></td>
				</tr>

			</table>
			<%-- <input type="hidden" value="<%= rs.getString("car_id")%>" name="car_idd" /> --%>

			<!--IN THIS CASE WE ALL SO DONT USE FORM INSTED WE USE A HREF TAG   -->
			<!-- DELETE TAG -->
			<a href="DeleteVehicleServlet?car_id=<%=rs.getString("car_id")%>" ><input type="button" value="Delete"></a>			
			<input type="submit" value="Edit" name="submit">
		</form>
		<%
			}
		%>

	</div>

</body>
</html>