package presentation;

import java.util.Optional;
import java.util.Scanner;

import entity.Customer;
import entity.MetroCardDetails;
import service.ServiceImplementation;

public class PresentationImplementation {
	ServiceImplementation serviceImplementation = new ServiceImplementation();
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. Search Customer By ID ");
		System.out.println("2. metro details");
		System.out.println("3.good bye");
	}

	public void performChoice(int choice) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		switch (choice) {
		case 1:
			System.out.println("Enter the customer Id");
			int customerId = sc.nextInt();
			Optional<Customer> optionalCustomer = serviceImplementation.getCustomerDetails(customerId);
			if(optionalCustomer.isPresent())
				System.out.println(optionalCustomer.get());
			else
				System.out.println("Does not exist");
			break;
		case 2:
			System.out.println("Enter metro id");
			int id=sc.nextInt();
			Optional<MetroCardDetails> Metrocard= serviceImplementation.getMetrocardDetails(id);
			if(Metrocard.isPresent()) {
				System.out.println(Metrocard.get());
				
			}
			else {
				System.out.println("does not exist");
				
			}
			
			System.exit(0);
		case 3:
			System.out.println("good bye");
		default:
			System.out.println("Invalid Choice");
			break;
		}
		
	}

}
