package patternHM;

import java.util.Scanner;

public class p8 {
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
		for(int c=1;c<=n;c++) {
			System.out.print(n);
		}
		System.out.println();
		rev=rev/10;
		}
	sc.close();
	}
	}


