<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="dao.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Vehicle</title>
</head>
<body>
<h2>UPDATE CAR DETAILS</h2>
	<%
		int id = Integer.parseInt(request.getParameter("car_id"));
		System.out.println(" id : " + id);
		String query = "Select * from vehicle_rental.vehicle where car_id=" + id + ";";
		Connection con = VehicleDAO.initializeDatabase();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		if (rs.next()) {
	%>
	<form action="EditVehicleServlet" method="post">
		<table>
			<tr>
				<th><label>CAR ID : </label></th>
				<td><input type="text" value="<%=rs.getInt("car_id")%>">
				</td>
			</tr>
			<tr>
				<th><label>NAME: </label></th>
				<td><input type="text" value="<%=rs.getString("car_name")%>"></td>
			</tr>
			<tr>
				<th><label>NUMBER : </label></th>
				<td><input type="text" value="<%=rs.getString("car_num")%>"></td>
			</tr>
			<tr>
				<th><label>MODEL NUMBER : </label></th>
				<td><input type="text" value="<%=rs.getString("car_model_no")%>"></td>
			</tr>
			<tr>
				<th><label>TYPE : </label></th>
				<td><input type="text" value="<%=rs.getString("car_type")%>"></td>
			</tr>
			<tr>
				<th><label>SEAT COUNT : </label></th>
				<td><input type="text" value="<%=rs.getInt("car_seat_count")%>">
				</td>
			</tr>
			<tr>
				<th><label>PRICE PER DAY : </label></th>
				<td><input type="text"
					value="<%=rs.getInt("car_price_per_day")%>"></td>
			</tr>
			<tr>
				<th><label>DESCRIPTION : </label></th>
				<td><textarea rows="5" cols="22"><%=rs.getString("car_description")%></textarea></td>
			</tr>
			<tr>
				<th><label>STATUS :</label></th>
				<td><input type="text" value="<%=rs.getString("car_status")%>"></td>
			</tr>
			<tr>
				<th><label>PHOTO : </label></th>
				<%-- <td><img src="${pageContext.request.contextPath}/images/c4.jpg" /></td> --%>
				<td><img src="images/<%=rs.getString("car_photo")%>" height="240" width="300"/></td>
			</tr>
			<tr></tr>
			<tr>
				<td><a href="viewVehicle.jsp"><input type="button"
						value="Back"></a> <br></td>
				<td><input type='submit' value='update'></td>
			</tr>
		</table>

		<%
		}
%>
	</form>



</body>
</html>