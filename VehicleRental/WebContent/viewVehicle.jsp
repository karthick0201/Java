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
	<h2>View Vehicles</h2>
<%
	String query = "SELECT * FROM vehicle_rental.vehicle";
	Connection con = VehicleDAO.initializeDatabase();
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(query);
	//String car_id, car_name, car_num, car_model_no, car_type, car_seat_count, car_price_per_day, car_description, car_status, car_photo;
	//ITERATE DATABASE:
	while (rs.next()) {
		String path=VehicleDAO.photoPath + rs.getString("car_photo");
%>

</head>
<body>

	<div>

		<table cellpadding="3" cellspacing="2" border="0">
			<tr>
				<th>Status :</th>
				<td><%= rs.getString("car_status") %></td>
			</tr>
			<tr>
				<td><img src="<%=path%>" height="100" width="100"></td>

			</tr>
			<tr>
				<th>Car Name :</th>
				<td><%= rs.getString("car_name") %></td>
			</tr>
			<tr>
				<th>Car Model No :</th>
				<td><%= rs.getString("car_model_no") %></td>
			</tr>
			<tr>
				<th>Seats :</th>
				<td><%= rs.getInt("car_seat_count") %></td>
			</tr>
			<tr>
				<th>Price Per Day :</th>
				<td><%= rs.getInt("car_price_per_day") %></td>
			</tr>
			<tr>
				<th>Car Number :</th>
				<td><%= rs.getString("car_num") %></td>
			</tr>


		</table>
		<%
			}
		%>

	</div>

</body>
</html>