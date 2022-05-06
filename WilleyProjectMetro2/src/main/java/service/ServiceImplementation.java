package service;

import java.util.Optional;

import enitity.Customer;
import persistence.DaoImplementation;
import presentation.PresentationImplementation;
public class ServiceImplementation implements ServiceInterface {

	DaoImplementation daoImplementation = new DaoImplementation();
	public Optional<Customer> getCustomerDetails(int Id) {
		// TODO Auto-generated method stub
		
		return daoImplementation.getRecordById(Id);
	}

}
