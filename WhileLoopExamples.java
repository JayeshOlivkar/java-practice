package com.tka.control_1;

public class WhileLoopExamples {
	public static void main(String[] args) {
		int k=1;
		// Print numbers from 1 to 10
		while(k<=10) {
			System.out.print(k+" ");
			k++;
		}
		
		System.out.println();
		int k2=20;
		// Print numbers from 20 to 11
		while(k2>=11) {
			System.out.print(k2+" ");
			k2--;
		}
		
		System.out.println();
		int k3=50;
		// Print numbers from 50 to 1 with a difference of 4
		while(k3>=1) {
			System.out.print(k3+" ");
			k3-=4;
		}
		
		System.out.println();
		int k4=0;
		// Print multiples of 4 from 0 to 40
		while(k4<=40) {
			System.out.print(k4+" ");
			k4+=4;
		}
	}
}
