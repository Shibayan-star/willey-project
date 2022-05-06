package persistence;

import java.util.Optional;

import enitity.Customer;

public interface DaoInterface {

	Optional<Customer> getRecordById(int customerId);
}
