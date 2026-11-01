package test;

import java.util.Scanner;

public class StateCapitalSwitch {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	        System.out.print("Enter state name: ");
	        String state = scan.nextLine();

	        switch (state) {

	        case "Maharashtra":
	            System.out.println("Capital: Mumbai");
	            break;

	        case "Gujarat":
	            System.out.println("Capital: Gandhinagar");
	            break;

	        case "Madhya Pradesh":
	            System.out.println("Capital: Bhopal");
	            break;

	        case "Rajasthan":
	            System.out.println("Capital: Jaipur");
	            break;

	        case "Goa":
	            System.out.println("Capital: Panaji");
	            break;

	        case "Karnataka":
	            System.out.println("Capital: Bengaluru");
	            break;

	        case "Telangana":
	            System.out.println("Capital: Hyderabad");
	            break;

	        case "Tamil Nadu":
	            System.out.println("Capital: Chennai");
	            break;

	        case "Kerala":
	            System.out.println("Capital: Thiruvananthapuram");
	            break;

	        case "West Bengal":
	            System.out.println("Capital: Kolkata");
	            break;

	        case "Bihar":
	            System.out.println("Capital: Patna");
	            break;

	        case "Uttar Pradesh":
	            System.out.println("Capital: Lucknow");
	            break;

	        case "Punjab":
	            System.out.println("Capital: Chandigarh");
	            break;

	        case "Haryana":
	            System.out.println("Capital: Chandigarh");
	            break;

	        case "Odisha":
	            System.out.println("Capital: Bhubaneswar");
	            break;

	        default:
	            System.out.println("Invalid State");

	        }
	        scan.close();
	}
}
