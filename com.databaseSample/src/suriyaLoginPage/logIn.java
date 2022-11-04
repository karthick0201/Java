package suriyaLoginPage;
import java.sql.*;
public class logIn {
	public logIn(String name,String passW)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Userdata","root","0000");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select password from accountdetail where name='"+name+"'");
		rs.next();
		String password=rs.getString(1);
		if(password.equals(passW)) {
			System.out.println("login Successfully");
		}
		else {
			System.out.println("Wrong password or username");
		}
		st.close();
		con.close();
	}
}