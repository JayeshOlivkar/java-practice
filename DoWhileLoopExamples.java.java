package com.tka.control_1;

public class DoWhileLoopExamples {
	public static void main(String[] args) {
		// Print numbers from 1 to 10
		int k=1;
		do {
			System.out.print(k+" ");
			k++;
		}while(k<=10);
		System.out.println();

		// Print numbers from 100 to 150 with a difference of 4
		int j=100;
		do {
			System.out.print(j+" ");
			j+=4;
		}while(j<=150);
		System.out.println();

		// Print numbers from 20 to 11
		int l=20;
		do {
			System.out.print(l+" ");
			l--;
		}while(l>=11);
		System.out.println();

		// Print numbers from 50 to 1 with a difference of 3
		int i=50;
		do {
			System.out.print(i+" ");
			i-=3;
		}while(i>=1);
	}
}
