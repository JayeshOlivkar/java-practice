package test;

import java.util.Scanner;

public class BookDetails {
	public static void main(String[] args) {
		// Demonstration of Scanner, different data types and basic calculation
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter Book ID: ");
		int book_id=scan.nextInt();
		scan.nextLine();
		
		System.out.print("Enter Book Name: ");
		String book_name=scan.nextLine();
		
		System.out.print("Enter Book Price: ");
		double book_price=scan.nextDouble();
		
		System.out.print("Enter Book Quantity: ");
		int book_quantity=scan.nextInt();
		
		double total_price=book_price * book_quantity;
		System.out.println();
		
		System.out.println("---Book Details---");
		System.out.println("Book ID: "+ book_id);
		System.out.println("Book Name: "+ book_name);
		System.out.println("Book Price: " + book_price);
		System.out.println("Book Quantity: " + book_quantity);
		System.out.println("Total Price: " + total_price);
		scan.close();
	}
}
