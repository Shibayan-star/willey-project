package service;
import java.util.Optional;

import entity.Customer;
import entity.MetroCardDetails;
import persistence.DaoImplementation;

public class ServiceImplementation implements ServiceInterface {
	DaoImplementation daoImplementation = new DaoImplementation();
	public Optional<Customer> getCustomerDetails(int Id) {
		// TODO Auto-generated method stub
		
		return daoImplementation.getRecordById(Id);
	}
	public Optional<MetroCardDetails> getMetrocardDetails(int id){
		return daoImplementation.getMetrorecordById(id);
	}


}
