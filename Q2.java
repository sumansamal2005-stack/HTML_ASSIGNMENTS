import java.sql.*;
public class Q2 {

	public static void main(String[] args) {
		try
		{
			String driver = "org.postgresql.Driver";
			String url = "jdbc:postgresql://192.168.1.17/cse_db24";
			String username = "24bcse69";
			String password = "24bcse69";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			if (con!= null)
				System.out.println("Connection established successfully ");
			Statement stmt = con.createStatement();
			String createQuery = "CREATE TABLE studentIWT (" +
	                    "roll_no INT PRIMARY KEY, " +
	                    "name VARCHAR(50), " +
	                    "age INT, " +
	                    "department VARCHAR(30), " +
	                    "cgpa NUMERIC(4,2))";
			 stmt.executeUpdate(createQuery);
	         System.out.println("Table created successfully!");
	         
		}catch (Exception e) {
			System.out.println(e);

	}
	}
}
