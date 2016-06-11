package ua.cybers.conectors;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Cn1 {
	public static class JavaToMySQL {
		 
	    // JDBC URL, username and password of MySQL server
	    private static final String url = "jdbc:mysql://localhost:3306/ss1";
	    private static final String user = "root";
	    private static final String password = "ss1985";
	 
	    // JDBC variables for opening and managing connection
	    private static Connection con;
	    private static Statement stmt;
	    private static ResultSet rs;
	}
}
