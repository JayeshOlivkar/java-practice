package com.tka.control_1;

public class control {
	public static void main(String[] args) {
	int age=18;
	if(age>=18) {
		System.out.println("You are eligible for vote");
		System.out.println("cast your vote to BJP");
	}
	else {
		System.out.println("You are not eligible for vote");
		System.out.println("Better luck next time");
	}
	
	int n=10;
	if(n%2==0) 
		System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
	
	if(n%3==0)
		System.out.println("Number is Divisiable by 3");
	else
		System.out.println("Number is not Divisiable by 3");
	
	if(n%5==0)
		System.out.println("Number is Divisiable by 5");
	else
		System.out.println("Number is not Divisiable by 5");
	}
}
