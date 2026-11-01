package classNobject;

import java.util.Scanner;

public class Laptop {
	String company, model, color, processor, operating_system;
	int ram, storage, quantity;
	double screen_size, price;

	public void acceptData() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Laptop Company Name: ");
		company = sc.nextLine();

		System.out.println("Enter Laptop Model: ");
		model = sc.nextLine();

		System.out.println("Enter Laptop Color: ");
		color = sc.nextLine();

		System.out.println("Enter Processor Name: ");
		processor = sc.nextLine();

		System.out.println("Enter Operating System: ");
		operating_system = sc.nextLine();

		System.out.println("Enter RAM (GB): ");
		ram = sc.nextInt();

		System.out.println("Enter Storage (GB): ");
		storage = sc.nextInt();

		System.out.println("Enter Screen Size (inches): ");
		screen_size = sc.nextDouble();

		System.out.println("Enter Quantity: ");
		quantity = sc.nextInt();

		System.out.println("Enter Laptop Price: ");
		price = sc.nextDouble();

		sc.close();
	}

	public double total() {

		double total = price * quantity;
		return total;
	}

	public void displayData() {

	        System.out.println("----- Laptop Details -----");

	        System.out.println("Laptop Company: " + company);
	        System.out.println("Laptop Model: " + model);
	        System.out.println("Laptop Color: " + color);
	        System.out.println("Processor: " + processor);
	        System.out.println("Operating System: " + operating_system);
	        System.out.println("RAM: " + ram + " GB");
	        System.out.println("Storage: " + storage + " GB");
	        System.out.println("Screen Size: " + screen_size + " inches");
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Laptop Price: " + price);
	        System.out.println("Total: " + total());
	    }


}
