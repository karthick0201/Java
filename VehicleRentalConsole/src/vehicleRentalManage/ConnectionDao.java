package vehicleRentalManage;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionDao {
	
	private static Properties getConnectionData() {

		Properties props = new Properties();

		String fileName = "C:\\Users\\Administrator\\eclipse-workspace\\VehicleRentalConsole\\src\\dao\\db.properties";

		try (FileInputStream in = new FileInputStream(fileName)) {
			props.load(in);
		} catch (IOException ex) {
			System.out.println("Exception ocured from properties");
			ex.printStackTrace();
		}

		return props;
	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Properties props = getConnectionData();
		String dbDriver = props.getProperty("dbDriver");
		String jdbcURL = props.getProperty("db.url");
		String jdbcUsername = props.getProperty("db.user");
		String jdbcPassword = props.getProperty("db.passwd");

		Connection con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		return con;
	}
}
