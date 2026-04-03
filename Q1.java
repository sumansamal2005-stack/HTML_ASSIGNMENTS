import java.sql.Connection;
import java.sql.DriverManager;

public class Q1 {

	public static void main(String[] args) {
		try {
			String driver = "org.postgresql.Driver";
			String url = "jdbc:postgresql://192.168.1.17/cse_db24";
			String username = "24bcsg69";
			String password = "24bcsg69";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			if(con != null)
				System.out.println("Connection established succesfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
