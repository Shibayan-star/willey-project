package com.project.service;

import java.util.Optional;

import com.project.entity.Customer;
import com.project.entity.Station;
import com.project.persistance.DaoImplementation;

public class ServiceImplementation implements ServiceInterface {

		DaoImplementation daoImplementation = new DaoImplementation();
		public Optional<Customer> getCustomerDetails(int Id) {
			// TODO Auto-generated method stub

			return daoImplementation.getRecordById(Id);
		}
		@Override
		public Optional<Station> getStationDetails(int id) {
			// TODO Auto-generated method stub
			return daoImplementation.getStationById(id);
		}
		
}
