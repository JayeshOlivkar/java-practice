package classNobject;

import java.util.Scanner;

public class Order {
	int order_id, quantity;
	String customer_name, product_name, order_date;
	String delivery_address, order_status;
	double price;

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Order ID: ");
		order_id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Name: ");
		customer_name = sc.nextLine();
		System.out.println("Enter Product Name: ");
		product_name = sc.nextLine();
		System.out.println("Enter Order Date: ");
		order_date = sc.nextLine();
		System.out.println("Enter Delivery Address: ");
		delivery_address = sc.nextLine();
		System.out.println("Enter Order Status: ");
		order_status = sc.nextLine();
		System.out.println("Enter Quantity: ");
		quantity = sc.nextInt();
		System.out.println("Enter Product Price: ");
		price = sc.nextDouble();
		sc.close();
	}

	public double total() {
		double total = price * quantity;
		return total;
	}

	public void displayData() {
		System.out.println("----- Order Details -----");
		System.out.println("Order ID: " + order_id);
		System.out.println("Customer Name: " + customer_name);
		System.out.println("Product Name: " + product_name);
		System.out.println("Order Date: " + order_date);
		System.out.println("Delivery Address: " + delivery_address);
		System.out.println("Order Status: " + order_status);
		System.out.println("Quantity: " + quantity);
		System.out.println("Product Price: " + price);
		System.out.println("Total Price: " + total());
	}
}
