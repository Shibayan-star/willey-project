package service;

import java.util.Optional;

import enitity.Customer;

public interface ServiceInterface {

	Optional<Customer> getCustomerDetails(int Id);
}
