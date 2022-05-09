package client;

import java.util.Scanner;

import presentation.PresentationImplementation;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		PresentationImplementation presentationImplementation = new PresentationImplementation();

		while (true) {
			presentationImplementation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			presentationImplementation.performChoice(choice);
		}
	}

}
