package com.laptrinhjavaweb.dao.impl;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.laptrinhjavaweb.dao.ICategoryDao;
import com.laptrinhjavaweb.model.CategoryModel;


public class CategoryDao implements ICategoryDao{

	public Connection getConnection() {
		try {
 			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/newservlet04month2024";
			String user = "root";
			String password = "12345678";
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		
		}
	}
	
	@Override
	public List<CategoryModel> findAll() {	
		List<CategoryModel> results = new ArrayList<>();
		String sql = "select * from category";
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		if(connection != null) {
			try {
				statement =  connection.prepareStatement(sql);
				resultSet = statement.executeQuery();
				while(resultSet.next()) {
					CategoryModel category = new CategoryModel();
					category.setId(resultSet.getLong("id"));
					category.setCode(resultSet.getString("code"));
					category.setName(resultSet.getString("name"));
					results.add(category);
				}
				
				return results;
			} catch (SQLException e) {
				return null;
			}finally {
				try {
					if(connection != null) {
						connection.close();
					}
					if(statement !=null) {
						statement.close();
					}
					if(resultSet !=null) {
						resultSet.close();
					}
					
				} catch (SQLException e) {
					return null;
				}
			}
			
		}	
		return null;
		
		
	}

	
	
	
}