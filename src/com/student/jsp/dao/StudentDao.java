package com.student.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.student.jsp.dto.Student;
import com.student.jsp.util.HelperClass;

public class StudentDao {
	HelperClass helperClass=new HelperClass();
	
	public Student saveStudent(Student student) {
		 Connection connection =helperClass.getConnection();
		 String sql="insert into student values (?,?,?)";
		 
		 
		 try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
preparedStatement.setString(3, student.getEmail());		
			preparedStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
			 try {
				 {	
					 System.out.println("connection closed");
				 }
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
		return student;
		
	}
		 public boolean deleteStudentById(int id)
		 {
			  Connection connection = helperClass.getConnection();
			 String sql="delete from student where id=?";
		 
		 
		 
		 try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			
			preparedStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
			 try {
				 {	
					 System.out.println("connection closed");
				 }
				
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
		return true;
		
		 }
		
			
		public Student updateStudent(Student student) {

	Connection connection=helperClass.getConnection();
	String sql="update student set name=?, email=? where id=?";
	try {
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(3,student.getId() );
		preparedStatement.setString(1, student.getName());
		preparedStatement.setString(2,student.getEmail());
		
		preparedStatement.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return student;
	
		
			
		}
	
    public void getAllStudent() {
    	 Connection connection = helperClass.getConnection();
		 String sql="select * from student";
		 
		 
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
    public void getByIdStudent(int id) {
   	 Connection connection = helperClass.getConnection();
		 String sql="select * from student where id=?";
		 
		 
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
   }
}
