package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbOperations {
	public static boolean existingPatient(String name, String phoneNo) {
		String dB_Url = "jdbc:mysql://localhost/hospital";
		String id = "root";
		String psw = id;
		try {

			Connection con = DriverManager.getConnection(dB_Url, id, psw);
			Statement st = con.createStatement();

			String sql = "select * from patient_details where phone_no='" + phoneNo + "'";
			/* st.executeUpdate(); */
			ResultSet rs = st.executeQuery(sql);
//			while (rs.next()) {
//				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
//						+ rs.getString(4) + "\t" + rs.getInt(5) + rs.getString(6));
//			}
			if (rs.next()) {
				System.out.println("Existing Patient!!!");
				System.out.println("Your Id is : " + rs.getInt(1));
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public static Patient existingPatient(String name, String phoneNo,String time) {
		Patient p = null;
		String dB_Url = "jdbc:mysql://localhost/hospital";
		String id = "root";
		String psw = id;
		try {

			Connection con = DriverManager.getConnection(dB_Url, id, psw);
			Statement st = con.createStatement();

			String sql = "select * from patient_details where phone_no='" + phoneNo + "'";
			/* st.executeUpdate(); */
			ResultSet rs = st.executeQuery(sql);
			int pId = -1;
			if(rs.next()) {
				/*
				 * System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" +
				 * rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getInt(5) +
				 * rs.getString(6));
				 */
				pId=rs.getInt(1);
			}
			p=new Patient(pId,name,phoneNo,time);
			System.out.println("existing patient method calling in dboperations class");
			//p.display();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}
	//FOR PATIENT ID GENERATE --> FIND MAXIMUM ID AND RETURN MAX+1
	public static int getPatient_Id() {
		String dB_Url = "jdbc:mysql://localhost/hospital";
		String id = "root";
		String psw = id;
		int pId = -1;
		try {

			Connection con = DriverManager.getConnection(dB_Url, id, psw);
			Statement st = con.createStatement();

			String sql = "select max(p_id) from patient_details;";
			/* st.executeUpdate(); */
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				pId=rs.getInt(1);
				System.out.println("Print : " + pId);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pId;
	}
}
