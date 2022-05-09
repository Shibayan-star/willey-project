package persistence;

import java.util.Optional;

import entity.Customer;
import entity.MetroCardDetails;

public interface DaoInterface {
	Optional<Customer> getRecordById(int customerId);
	Optional< MetroCardDetails> getMetrorecordById(int customerId);

}
