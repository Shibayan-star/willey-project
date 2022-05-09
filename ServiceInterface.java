package service;

import java.util.Optional;

import entity.Customer;

public interface ServiceInterface {
	Optional<Customer> getCustomerDetails(int Id);

}
