package MethodHM;

import java.util.Scanner;

public class Employee {
	int id, age;
	String name, designation, qualification, city;
	double salary;

	public void AcceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee Name: ");
		name = sc.nextLine();
		System.out.print("Enter Employee Designation: ");
		designation = sc.nextLine();
		System.out.print("Enter Salary: ");
		salary = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter Qualification: ");
		qualification = sc.nextLine();
		System.out.print("Enter Age: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter City: ");
		city = sc.nextLine();
		System.out.println();
		sc.close();
	}

	public void Show() {
		System.err.println("*****Employee Details*****");
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Designation: " + designation);
		System.out.println("Salary: " + salary);
		System.out.println("Qualification: " + qualification);
		System.out.println("Employee Age: " + age);
		System.out.println("City: " + city);
	}

}
