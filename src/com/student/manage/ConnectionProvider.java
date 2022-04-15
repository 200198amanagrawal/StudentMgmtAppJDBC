package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	static Connection connection;
	public  static Connection creareConnection()
	{
		try {
			//load the db
			Class.forName("com.mysql.jdbc.Driver");
			
			//create the connection
			String userString="root";
			String userPasswordString="root";
			String urlString="jdbc:mySQL://localhost:3306/student_manage";
			
			try {
				connection=DriverManager.getConnection(urlString,userString,userPasswordString);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
}
