package presentation;

import java.util.Optional;
import java.util.Scanner;

import enitity.Customer;
import service.ServiceImplementation;

public class PresentationImplementation implements PresentationInterface {

	ServiceImplementation serviceImplementation = new ServiceImplementation();
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. Search Customer By ID ");
		System.out.println("2. Exit");
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
			System.out.println("Good Bye");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
			break;
		}
		
	}

}
