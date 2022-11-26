<%@ page import="java.util.*"%>
<%@ page import="java.sql.*"%>


<%
	int id = (int) session.getValue("id");

	//int id=10;
	String dbDriver = "com.mysql.cj.jdbc.Driver";
	String jdbcURL = "jdbc:mysql://localhost/hospitalservlet";
	String jdbcUsername = "root";
	String jdbcPassword = "root";
	///Class.forName(dbDriver);
	Connection con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
	Statement s = con.createStatement();

	if (request.getParameter("submit") != null) {
		String n = request.getParameter("pname");
		String pno = request.getParameter("pno");
		String query = "UPDATE hospitalservlet.patient_db1 SET patient_name='" + n + "',phone_no='" + pno
				+ "' WHERE patient_id=" + id + ";";
		s.executeUpdate(query);
		System.out.println("Updated Successfully \n" + "name : " + n + "\nphno : " + pno);
	}
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update_Profile</title>
</head>
<body>
	<h2>UPDATE PATIENT DETAILS</h2>
	<br>
	<%
		Statement st = con.createStatement();
		String sql = "select * from patient_db1 where patient_id=" + id + ";";
		ResultSet rs = st.executeQuery(sql);
		//System.out.println("ididid:::: ");
		//System.out.print(p_id);
		if (rs.next()) {
	%>
	<form>
		<table cellpadding="2" cellspacing="2" border="1">
			<tr>
				<td>Name</td>
				<td><input type="text" name="pname"
					value="<%=rs.getString("patient_name")%>"></td>
			</tr>
			<tr>
				<td>Phone No</td>
				<td><input type="text" name="pno"
					value="<%=rs.getString("phone_no")%>"></td>
			</tr>
			<tr>
				<%
					}
				%>
				<td><input type="submit" name="submit" value="Update"
					onclick="update()"></td>
			</tr>
		</table>
	</form>
	<script>
		function update() {
			alert('Updated Successfull!!!!');
		}
	</script>
	<a href="UserProfile.jsp">BACK</a>
</body>
</html>