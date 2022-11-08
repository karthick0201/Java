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
		String psw = "root";
		try {

			Connection con = DriverManager.getConnection(dB_Url, id, psw);
			Statement st = con.createStatement();

			String sql = "select * from patient_details where phone_no='" + phoneNo + "'";
			/* st.executeUpdate(); */
			ResultSet rs = st.executeQuery(sql);
			int pId = 0;
			if(rs.next()) {
				pId=rs.getInt(1);
			}
			//check whether old patient or new patient 
			//if new  --> pId,name,phoneNo,time
			//if old  --> name,phoneno,time
			boolean pcheck=DbOperations.existingPatient(name, phoneNo);
			if(pcheck) {
				p=new Patient(pId,name,phoneNo,time);
				//System.out.println("old patient ::: existing patient method calling in dboperations class");
			}else {
				p=new Patient(name,time,phoneNo);
				//System.out.println("new patient ::: existing patient method calling in dboperations class");
			}
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
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pId;
	}

	public static void addDataIntoDB(Patient p) {
		String dB_Url="jdbc:mysql://localhost/hospital";
		String id="root";
		String psw="root";
		try {
			Connection con=DriverManager.getConnection(dB_Url,id,psw);
			Statement st=con.createStatement();
			boolean oldPatient=DbOperations.existingPatient(p.name,p.phoneNo);
			/*OLD PATIENT DETAIL UPDATED IN DATABASE*/
			if(oldPatient) {
				
				String sql="UPDATE patient_details SET in_time='" + p.inTime +"',out_time='"+ p.outTime +"',time_taken="+ p.timeTaken+" WHERE p_id="+p.patient_id +";";                           
//				System.out.println("in TIme   : " + p.inTime);
//				System.out.println("Out TIme  : " + p.outTime);
//				System.out.println("timeTaken : " + p.timeTaken);
//				System.out.println("id        : " + p.patient_id);
				st.executeUpdate(sql);
				//System.out.println("old patient detail updared in database");
			}else {
				/*NEW PATIENT DETAIL ADD IN DATABASE
				            InserT QuerY:
				-----------------------------------*/
				String sql="INSERT INTO patient_details value("+p.patient_id +",'"+ p.name +"','"+p.inTime+"','"+p.outTime+"',"+p.timeTaken+",'"+p.phoneNo+"')";
				st.executeUpdate(sql);
//				System.out.println("new patient detail updated in database");
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void printDBData() {
		
		String dB_Url="jdbc:mysql://localhost/hospital";
		String id="root";
		String psw="root";
		
		try {
			Connection con=DriverManager.getConnection(dB_Url,id,psw);
			Statement st=con.createStatement();
			
			String sql="Select * from patient_details;";
			
			ResultSet rs=st.executeQuery(sql);
				System.out.println("Patient_Id     P_Name    In_Time   Out_Time   Time_Taken   Phone_Number");
			while(rs.next()) {
				System.out.format("%9s %12s %9s %9s %9s %18s", + rs.getInt(1) +"","" + rs.getString(2) +"","" + rs.getString(3) +"","" +rs.getString(4) +"","" + rs.getString(5) +"","" + rs.getString(6) + "\n");
			}
			System.out.println("------------------------------------------------------------------------");
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
