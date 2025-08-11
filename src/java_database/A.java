package java_database;
import java.sql.*;

public class A {
	public static void main(String args[]) {
		try {
			//Connect to database - use psaDB (SQL)
						
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","mysql");

			//Write & execute SQl query
			Statement stmnt =  con.createStatement();
			
			//stmnt.executeUpdate("INSERT INTO registration (id,name, gmail, phone_no) VALUES ('2','adam', 'aman@gmail.com', '963262966')");
			
			//execute the queries
			String selectquery="select * from registration;";
			
		ResultSet rs=stmnt.executeQuery(selectquery);
		while(rs.next()) {
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("gmail"));
			System.out.println(rs.getString("phone_no"));
		}
			
			
						
			//Close database connection
			con.close();
			} 
		catch (Exception e) {
				e.printStackTrace();
			}

		
	}
}
