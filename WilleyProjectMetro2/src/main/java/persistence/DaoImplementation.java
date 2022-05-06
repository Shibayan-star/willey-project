package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;



import enitity.Customer;

public class DaoImplementation implements DaoInterface {

	Connection connection = null;
	Statement statement = null;
	public Optional<Customer> getRecordById(int Id) {
		// TODO Auto-generated method stub
		Customer customer=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyproject", "root", "willey");
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

}
