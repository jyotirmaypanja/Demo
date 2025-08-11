package java_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HandlingResultSet {
	public static void main(String[] args) {
		
		
		try {
			//Connect to database - use psaDB (SQL)
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","mysql");
		
			
			//Write & execute SQl query
			Statement stmnt =  con.createStatement();
			
			//stmnt.executeUpdate("INSERT INTO registration (name, gmail, phone_no) VALUES ('aman', 'adam@gmail.com', '9632629555')");
			
			//execute the queries
			String selectquery="select * from registration;";
			
			ResultSet rs=stmnt.executeQuery(selectquery);
			
			//while(rs.next()) {
				//basic syntax for resultset
				
				//int id=rs.getInt("id");
				//System.out.println(id);
				
				
				//String fname=rs.getString("name");
				//System.out.println(fname);
				
				
//we can use column indexing
				//int id=rs.getInt(1);
			//	System.out.println(id);
				
				//String fname=rs.getString(2);
				//System.out.println(fname);
				
							
				
			//}
			
			while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String gmail = rs.getString("gmail");
                String mobileno = rs.getString("phone_no");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Gmail: " + gmail);
                System.out.println("Mobile No: " + mobileno);
                System.out.println("----------------------------");
            }
			//Close database connection
			con.close();	
			
			} 
		catch (Exception e) {
				e.printStackTrace();
			}
		
	}

}
