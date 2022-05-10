package com.project.persistance;

import java.util.Optional;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.project.entity.Customer;
import com.project.entity.Station;

public class DaoImplementation implements DaoInterface{

	Connection connection = null;
	Statement statement = null;
	public Optional<Customer> getRecordById(int Id) {
		// TODO Auto-generated method stub
		Customer customer=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyproject", "root", "MYSQL@adi15");
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM customerdetails where customerId ="+Id);
			while (resultSet.next()) {
				int customerId = resultSet.getInt("customerId");
				String name = resultSet.getString("name");
				String phonenumber= resultSet.getString("phonenumber");
				int metroCardDetails = resultSet.getInt("metrocardId");
				customer = new Customer(customerId, name, phonenumber, metroCardDetails);
			}
			Optional<Customer> optionalEmployee=Optional.ofNullable(customer);
			return optionalEmployee;
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	public Optional<Station> getStationById(int id) {
		// TODO Auto-generated method stub
		Station station=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyproject", "root", "MYSQL@adi15");
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM station where station_id ="+id);
			while(resultSet.next())
			{
				int station_id=resultSet.getInt("station_id");
				String station_name=resultSet.getString("station_name");
				station=new Station(station_id,station_name);
			}
			Optional<Station> optionalStation=Optional.ofNullable(station);
			return optionalStation;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		}
		return null;
	
	}
}


