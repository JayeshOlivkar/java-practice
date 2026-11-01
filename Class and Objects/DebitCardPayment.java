package classNobject;

import java.util.Scanner;

public class DebitCardPayment {

	String bank_name, card_holder_name, card_type, transaction_id;
	long card_number;
	double amount, service_charge;

	public void acceptData() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Bank Name: ");
		bank_name = sc.nextLine();

		System.out.println("Enter Card Holder Name: ");
		card_holder_name = sc.nextLine();

		System.out.println("Enter Card Type (Visa/Mastercard): ");
		card_type = sc.nextLine();

		System.out.println("Enter Transaction ID: ");
		transaction_id = sc.nextLine();

		System.out.println("Enter Debit Card Number: ");
		card_number = sc.nextLong();

		System.out.println("Enter Payment Amount: ");
		amount = sc.nextDouble();

		System.out.println("Enter Service Charge: ");
		service_charge = sc.nextDouble();

		sc.close();
	}

	public double total() {

		double total = amount + service_charge;
		return total;
	}

	public void displayData() {

	        System.out.println("----- Debit Card Payment Details -----");

	        System.out.println("Bank Name: " + bank_name);
	        System.out.println("Card Holder Name: " + card_holder_name);
	        System.out.println("Card Type: " + card_type);
	        System.out.println("Transaction ID: " + transaction_id);
	        System.out.println("Debit Card Number: " + card_number);
	        System.out.println("Payment Amount: " + amount);
	        System.out.println("Service Charge: " + service_charge);
	        System.out.println("Total Amount: " + total());
	}

}
