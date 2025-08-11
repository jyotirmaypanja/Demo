package java_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class preparedStatement {
	public static void main(String[] args) {
		try {
			//Connect to database - use psaDB (SQL)
						
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","mysql");

			//Write & execute SQl query
			Statement stmnt =  con.createStatement();
			
			//stmnt.executeUpdate("INSERT INTO registration (id,name, gmail, phone_no) VALUES ('2','adam', 'aman@gmail.com', '963262966')");
			
			//execute the queries
			//String selectquery="select * from registration where name=?;";
			
		//	PreparedStatement ps=con.prepareStatement(selectquery);
		//	ps.setString(1, "aman");
			
		//ResultSet rs=ps.executeQuery();
		
		
		
		// Step 2: Write SQL query with placeholders
        String query = "INSERT INTO registration (name, gmail, phone_no) VALUES (?, ?, ?)";

        // Step 3: Create PreparedStatement
        PreparedStatement pstmt = con.prepareStatement(query);

        // Step 4: Set values for 1st row
        pstmt.setString(1, "shyam");
        pstmt.setString(2, "shyam@gmail.com");
        pstmt.setString(3, "956929555");
        pstmt.executeUpdate(); // Insert 1st row

        // Step 5: Set values for 2nd row
        pstmt.setString(1, "shreee");
        pstmt.setString(2, "shree@gmail.com");
        pstmt.setString(3, "9632456896");
        pstmt.executeUpdate(); // Insert 2nd row
        
        
		
		
			
			
						
			//Close database connection
			con.close();
			} 
		catch (Exception e) {
				e.printStackTrace();
			}

		
	}

}
