package com.project.service;

import java.util.Optional;

import com.project.entity.*;

public interface ServiceInterface {

	Optional<Customer> getCustomerDetails(int Id);
	Optional<Station> getStationDetails(int id);
}
