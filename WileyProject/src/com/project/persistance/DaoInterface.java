package com.project.persistance;

import java.util.Optional;

import com.project.entity.*;

public interface DaoInterface {

	Optional<Customer> getRecordById(int customerId);
	Optional<Station> getStationById(int station_id);
}