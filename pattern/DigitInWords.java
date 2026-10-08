package patternHM;

import java.util.Scanner;

public class p9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int y=sc.nextInt();
		int n,rev=0;
		while(y>0) {
			n=y%10;
			rev=rev*10+n;
			y=y/10;
		}
		while(rev>0) {
			n=rev%10;
		    switch(n) {
	        case 0:
	        	System.out.print("Zero ");
	        	break;
	        case 1:
				System.out.print("One ");
				break;
	        case 2:
				System.out.print("Two ");
				break;
	        case 3:
				System.out.print("Three ");
				break;
	        case 4:
				System.out.print("Four ");
				break;
	        case 5:
				System.out.print("Five ");
				break;
	        case 6:
				System.out.print("Six ");
				break;
	        case 7:
				System.out.print("Seven ");
				break;
	        case 8:
				System.out.print("Eight ");
				break;
	        case 9:
				System.out.print("Nine ");
				break;
	    }
			rev=rev/10;
			
			}
		sc.close();
		}
	}

