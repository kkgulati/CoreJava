package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection connection=DriverManager.getConnection("jdbc:derby:sapientdb;create=false");
			//System.out.println(connection);
			
			//create(connection);
			//save(connection);
			read(connection);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void create(Connection connection){
		try {
			Statement statement=connection.createStatement();
			statement.execute("create table employee(id int,name varchar(20))");
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	private void save(Connection connection){
		try {
			Statement statement=connection.createStatement();
			statement.executeUpdate("insert into employee values(100,'Ram')");
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void read(Connection connection){
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select name from employee where id=100");
			resultSet.next();
			System.out.println(resultSet.getString(1));
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
