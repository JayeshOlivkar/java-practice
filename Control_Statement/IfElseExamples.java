package com.tka.control_1;

public class IfElseExamples {
	public static void main(String[] args) {
	// Check voting eligibility
	int age=18;
	if(age>=18) {
		System.out.println("You are eligible for vote");
		System.out.println("Please cast your vote");
	}
	else {
		System.out.println("You are not eligible for vote");
		System.out.println("Better luck next time");
	}

	// Check whether a number is even or odd
	int n=10;
	if(n%2==0) 
		System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");

	// Check divisibility by 3
	if(n%3==0)
		System.out.println("Number is Divisiable by 3");
	else
		System.out.println("Number is not Divisiable by 3");

	// Check divisibility by 5
	if(n%5==0)
		System.out.println("Number is Divisiable by 5");
	else
		System.out.println("Number is not Divisiable by 5");

	// Check divisibility by 3 and 5 using else-if ladder
	int x = 15;

	if(x % 3 == 0 && x % 5 == 0)
	    System.out.println("Mango and Apple");
	else if(x % 5 == 0)
	    System.out.println("Apple");
	else if(x % 3 == 0)
	    System.out.println("Mango");
	else
	    System.out.println(x);
	}
}
