package hospital;

import java.sql.*;

import com.mysql.cj.xdevapi.PreparableStatement;

public class UserDAO {

	protected static Connection initializeDatabase() throws SQLException, ClassNotFoundException {
		String dbDriver = "com.mysql.cj.jdbc.Driver";
		String jdbcURL = "jdbc:mysql://localhost/hospitalservlet";
		String jdbcUsername = "root";
		String jdbcPassword = "root";
//		/Class.forName(dbDriver);
		Connection  con=DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
		return con;	
	}

	public String insertUser(Patient p) throws ClassNotFoundException, SQLException {
		System.out.println("----------------------------...");
		
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = initializeDatabase();
			Statement st = con.createStatement();
//			String sql = "INSERT INTO patient_db1(patient_name,phone_no,in_time,doctor_time) values('" + p.name + "','"
//					+ p.phoneNo + "','" + p.inTime + "'," + p.doctorTime + ")";
			String sql = "INSERT INTO patient_db1(patient_name,phone_no,in_time,doctor_time) values(?,?,?,?)";
			
			String result="Data Entered Successfully";
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, p.getName());
				ps.setString(2, p.getPhoneNo());
				ps.setString(3, p.getInTime());
				ps.setInt(4, p.doctorTime);
				ps.executeUpdate();
			} catch (SQLException e) {
				result="Data Not Entered Successfully";
				e.printStackTrace();
			}
			return result;

		}
	//AUTHCATE --> CHECKING
	public static boolean isVaildate(int id, String phoneNo) {
		try {
			Connection con=UserDAO.initializeDatabase();
			Statement st = con.createStatement();
			String sql="select * from hospitalservlet.patient_db1";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				int id2=rs.getInt(1);
				String pno2=rs.getString(3);
				if(id==id2 && pno2.equals(phoneNo)) {
					System.out.println("Return True from user DAO class");
					return true;	
				}
			}
			return false;	
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	return false;	
	}
	
}
