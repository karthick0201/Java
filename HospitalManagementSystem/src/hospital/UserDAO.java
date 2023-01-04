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
	
	/*1. INSERT USER */
	public String insertUser(Patient p) throws ClassNotFoundException, SQLException {
		System.out.println("----------------------------...");
		
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = initializeDatabase();
			Statement st = con.createStatement();
//			String sql = "INSERT INTO patient_db1(patient_name,phone_no,in_time,doctor_time) values('" + p.name + "','"
//					+ p.phoneNo + "','" + p.inTime + "'," + p.doctorTime + ")";
			String sql = "INSERT INTO patient_db1(patient_name,phone_no) values(?,?)";
		/*
		 * String sql =
		 * "INSERT INTO patient_db1(patient_name,phone_no,in_time,doctor_time) values(?,?,?,?)"
		 * ;
		 */
			
			String result="Data Entered Successfully";
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, p.getName());
				ps.setString(2, p.getPhoneNo());
				//ps.setString(3, p.getInTime());
				//ps.setInt(4, p.doctorTime);
				ps.executeUpdate();
			} catch (SQLException e) {
				result="Data Not Entered Successfully";
				e.printStackTrace();
			}
			return result;

		}
	//2. AUTHCATION --> CHECKING
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
	
	public static int getUserId(String phone_no) {
		try {
			Connection con=UserDAO.initializeDatabase();
			Statement st=con.createStatement();
			String sql="SELECT patient_id from hospitalservlet.patient_db1 WHERE phone_no="+ phone_no+";";
			
			ResultSet rs=st.executeQuery(sql);
			int id;
			if(rs.next()) {
				id=rs.getInt(1);
				System.out.println("Your Id Is : " + id);
				return id;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return -1;
	}
	public static boolean update(Patient p) {
		System.out.println("Updated success");
		return true;
	}
	
	public static void getPatientDetails(Patient p) {
		Connection con;
		try {
			con = UserDAO.initializeDatabase();
			Statement st=con.createStatement();
			String sql="SELECT * FROM hospitalservlet.patient_db1 WHERE patient_id="+ p.patient_id+";";
			ResultSet rs=st.executeQuery(sql);
			String name,phoneno;
			if(rs.next()) {
				name=rs.getString(2);
				phoneno=rs.getString(3);
				p.setName(name);
				p.setPhoneNo(phoneno);
				System.out.println("********************");
				System.out.println("Your Name : " + name);
				System.out.println("Your phone : " + phoneno);
				System.out.println("********************");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public static void insertCheckUpDetailsDB2(Patient p) {
		try {
			Connection con=UserDAO.initializeDatabase();
			String sql="INSERT INTO hospitalservlet.patient_records(in_time,out_time,doctor_time,waiting_time,patient_id) VALUES(?,?,?,?,?);";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,p.getInTime());
			ps.setString(2,p.getOutTime());
			ps.setInt(3,p.getDoctorTime());
			ps.setInt(4,p.getWaitingTime());
			ps.setInt(5,p.getPatient_id());
			
			ps.executeUpdate();
			System.out.println("Inserted Successfull");
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Second Table inserted Unsuccessfull!!!");
			e.printStackTrace();
		}
		
	
	}
	public static ResultSet getResultSet(int id) {
		
		
		
		return null;
	}
	
}
