import java.sql.*;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter roll");
		int uroll=sc.nextInt();
		System.out.println("Enter CGPA");
		float ucgpa=sc.nextFloat();
		try {
			String driver="org.postgresql.Driver";
			String url="jdbc:postgresql://192.168.1.17/cse_db24";
			String username="24bcse69";
			String password="24bcse69";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password);
			if(con!=null)
				System.out.println("connection established successfully");
			String qry = "UPDATE studentIWT SET CGPA=? WHERE roll_no=?";
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setFloat(1,ucgpa);
			ps.setInt(2,uroll);		
			int i = ps.executeUpdate();
			if(i==1) {
				System.out.print("Record Updated Successfully");
			}
			ps.close();
			con.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}
