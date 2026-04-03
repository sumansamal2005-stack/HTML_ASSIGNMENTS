import java.sql.*;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll No: ");
        int roll = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter CGPA: ");
        float cgpa = sc.nextFloat();
        try {
            String driver = "org.postgresql.Driver";
            String url = "jdbc:postgresql://192.168.1.17/cse_db24";
            String username = "24bcse69";
            String password = "24bcse69";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password); 
            String qry = "INSERT INTO studentIWT(roll_no,name,age,department,cgpa) VALUES (?,?,?,?,?)";
    		PreparedStatement ps = con.prepareStatement(qry);
    		ps.setInt(1, roll);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, dept);
            ps.setFloat(5, cgpa);
            if (con != null) {
                System.out.println("Connection established successfully...");
          }

		
		int i = ps.executeUpdate();
		if(i==1) {
			System.out.print("Record Inserted Successfully");
		}
		ps.close();
		con.close();
		}
	catch(Exception e) {
		System.out.print(e);
	}
}
}



