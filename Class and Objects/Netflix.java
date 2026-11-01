package classNobject;

import java.util.Scanner;

public class Netflix {
	String user_name, email, subscription_plan;
    String payment_method, subscription_status;
    int subscription_duration;
    double subscription_price;

    public void acceptData() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Name: ");
        user_name = sc.nextLine();

        System.out.println("Enter Email: ");
        email = sc.nextLine();

        System.out.println("Enter Subscription Plan: ");
        subscription_plan = sc.nextLine();

        System.out.println("Enter Payment Method: ");
        payment_method = sc.nextLine();

        System.out.println("Enter Subscription Status: ");
        subscription_status = sc.nextLine();

        System.out.println("Enter Subscription Duration (Months): ");
        subscription_duration = sc.nextInt();

        System.out.println("Enter Subscription Price: ");
        subscription_price = sc.nextDouble();

        sc.close();
    }

    public void displayData() {

        System.out.println("----- Netflix Subscription Details -----");

        System.out.println("User Name: " + user_name);
        System.out.println("Email: " + email);
        System.out.println("Subscription Plan: " + subscription_plan);
        System.out.println("Payment Method: " + payment_method);
        System.out.println("Subscription Status: " + subscription_status);
        System.out.println("Subscription Duration: " + subscription_duration + " Months");
        System.out.println("Subscription Price: " + subscription_price);

    }
}
