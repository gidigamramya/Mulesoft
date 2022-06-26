import java.sql.*;

public class Table_Insertion {

	public static void main(String[] args) {
		try {

			Connection con = null; 		// Create Connection
			Statement stmt = null; 		//Declare Statement & Initialize with null

			con = DriverManager			//Connect to DataBase
					.getConnection("jdbc:sqlite:/C:\\Users\\Microsoft\\OneDrive\\Desktop\\Mulesoft\\database.db");
							
			System.out.println("Database Connection Successful !!");

			stmt = con.createStatement(); // Create Statement

			String query1 = "INSERT INTO MovieTable values ('chhichhore','Nitesh Tiwari','Sushanth singh rajput','Shraddha Kapoor',2019);";
			stmt.executeUpdate(query1); // Create Query-1

			String query2 = "INSERT INTO MovieTable values ('Banglore Days','Anjali Menon','DQ salman','Nazriya Nazim',2014);";
			stmt.executeUpdate(query2); // Create Query-2

			String query3 = "INSERT INTO MovieTable values ('shyam singha Roy','Rahul Sankrityan','Nani','Sai pallavi',2021);";
			stmt.executeUpdate(query3); // Create Query-3

			String query4 = "INSERT INTO MovieTable values ('Raja','M siva','Venkatesh','Soundarya',1999);";
			stmt.executeUpdate(query4); // Create Query-4

			String query5 = "INSERT INTO MovieTable values ('RRR','SS Rajamouli','Ramcharan','Alia Bhatt',2022);";
			stmt.executeUpdate(query5); // Create Query-5

			stmt.close();

			con.close(); 				//Close Connection
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Data  Insertion successful!!");
	}
}