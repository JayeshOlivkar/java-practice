package TypesOfMethodsHM;

import java.util.Scanner;

public class Employee {
	int id, age;
	String name, designation, qualification, city;
	double salary;
	
	double pt=(salary*12)/100;
	double pf=(salary*10)/100;

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
	
	public double gSalary() {
		double da=(salary*5)/100;
		double hra=(salary*15)/100;
		double tra=(salary*10)/100;
		double gross_salary=salary+da+hra+tra;
		return gross_salary;
	}
	
	public double nSalary() {
		double pt=(salary*12)/100;
		double pf=(salary*10)/100;
		double net_salary=gSalary()-(pf+pt);
		return net_salary;
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
		System.out.println("Gross Salary: "+ gSalary());
		System.out.println("Net Salary: "+nSalary());
	}
}
