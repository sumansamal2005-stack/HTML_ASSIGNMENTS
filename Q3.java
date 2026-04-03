import java.sql.*;
public class Q3 {

	public static void main(String[] args) {
        try {
            String driver = "org.postgresql.Driver";
            String url = "jdbc:postgresql://192.168.1.17/cse_db24";
            String username = "24bcse69";
            String password = "24bcse69";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password); 
            if (con != null) {
                System.out.println("Connection established successfully...");
            }

            Statement st=con.createStatement();
			String qry1="INSERT INTO studentIWT VALUES(19,'Sreeman',21,'CSE',8.9)";
			String qry2="INSERT INTO studentIWT VALUES(2,'Aman',20,'CSE',9.3)";
			st.executeUpdate(qry1);
			st.execute(qry2);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
	}
}

		


