package com.tka.demo;

public class a {
	public static void main(String[] args) {
		int a=10,b=20,c=30;
		System.out.println(a>b);
		System.out.println(a>b && a<c);
		System.out.println(a<c);
		System.out.println(a!=b && a>b);
		System.out.println(a==b && b!=c);
		System.out.println(!(a>b) && a<c);
		System.out.println(!(a==b || b!=c));
		
		int h=20;
		System.out.println(h);
		h+=5;
		System.out.println(h);
		h-=10;
		System.out.println(h);
		// h=10;
		h/=2;
		System.out.println(h);
		h%=5;
		System.out.println(h);
		System.out.println();
		
		int y=10;
		System.out.println(y);
		++y;
		System.out.println(y);
		y++;
		System.out.println(y);
		System.out.println();
		--y;
		System.out.println(y);
		System.out.println();
		
		String s1=(100<200)? "Mango":"Apple";
		System.out.println(s1);
		String j=(100<500)? "Purple":"Red";
		System.out.println(j);
	}
}
