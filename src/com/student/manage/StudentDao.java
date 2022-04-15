package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudentToDB(Student student) {
		boolean f = false;
		Connection connection = ConnectionProvider.creareConnection();
		String query = "Insert into Student(sname,sphone,scity) values(?,?,?)";
		try {
			
			//dynamic query created and fired using the connection
			PreparedStatement ptmst = connection.prepareStatement(query);
			
			//at 1st index i.e. student name the value is passed as seen from query
			ptmst.setString(1, student.getStudentName());
			ptmst.setString(2, student.getStudentPhone());
			ptmst.setString(3, student.getStudentCity());
			ptmst.executeUpdate();
			f = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deletetStudentFromDB(int id) {
		boolean f = false;
		Connection connection = ConnectionProvider.creareConnection();
		String query = "Delete from Student where sid=?";
		try {
			
			//dynamic query created and fired using the connection
			PreparedStatement ptmst = connection.prepareStatement(query);
			
			//at 1st index i.e. student name the value is passed as seen from query
			ptmst.setInt(1, id);
			ptmst.executeUpdate();
			f = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

	public static void showStudentFromDB() {
		// TODO Auto-generated method stub
		Connection connection = ConnectionProvider.creareConnection();
		String query = "Select * from Student";
		try {
			
			//static query created and fired using the connection
			Statement ptmst = connection.createStatement();
			
			//since its the display the query is not updated and executed and the result is stored in resultset
			ResultSet set=ptmst.executeQuery(query);
			while(set.next())
			{
				int id=set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city=set.getString(4);
				
				System.out.println(id+" | "+name+" | "+phone+" | "+city);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
