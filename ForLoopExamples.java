package com.tka.control_1;


public class ForLoopExamples {
	public static void main(String[] args) {
		// Print numbers from 1 to 10
		for(int i=1;i<=10;i++){
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// Print numbers from 20 to 11
		for(int i=20;i>=11;i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// Print numbers from -10 to 50 with a difference of 5
		for(int i=-10;i<=50;i+=5) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// Print numbers from 50 to 1 with a difference of 5
		for(int i=50;i>=1;i-=5){
			System.out.print(i+" ");
		}
	}
}
