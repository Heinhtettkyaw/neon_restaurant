package Admin;
import java.sql.*;
import javax.swing.*;

public class sqliteConnection {
public static Connection dbConnector() {
	String dbname="restaurantlist";
	String dbURL="jdbc:mysql://localhost:3306/restaurantlist";
	String username="root";
	String password="";
	Connection conn= null;
	
	try {
	conn = DriverManager.getConnection(dbURL,username,password);
	}
	catch(SQLException e) {
		System.out.println("Unable to continue to database"+ dbname+"\nError"+e.getMessage());
	}
	return conn;
}
}
