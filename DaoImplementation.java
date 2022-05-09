package persistence;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Optional;

import entity.Customer;
import entity.MetroCardDetails;



public class DaoImplementation implements DaoInterface {
	Connection connection = null;
	Statement statement = null;
	public Optional<Customer> getRecordById(int Id) {
		// TODO Auto-generated method stub
		Customer customer=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydatabase", "root", "wiley");
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
	@Override
	public Optional<MetroCardDetails> getMetrorecordById(int id) {
		MetroCardDetails m=null;
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydatabase", "root", "wiley");
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM metroCardDetails where metroId ="+id);
			while (resultSet.next()) {
				int metroId = resultSet.getInt("metroId");
				Date  startdate = resultSet.getDate("metroStartValidity");
				Date enddate= resultSet.getDate("metroEndValidity");
				SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
			    String startValidity = formatter.format(startdate); 
			    String endValidity=formatter.format(enddate);
			    
				int metroBalance = resultSet.getInt("metroBalance");
				m=new MetroCardDetails(metroId,startValidity,endValidity,metroBalance);
			}
			Optional<MetroCardDetails> optionalMetro=Optional.ofNullable(m);
			return optionalMetro;
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

}
