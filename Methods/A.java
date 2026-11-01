package TypesOFMethods;

public class A {

	public static void sumOdd(int a) {
		int n=0,sum=0;
		while(a>0) {
			n=a%10;
			if(n%2!=0) {
				sum=sum+n;
			}
			a=a/10;
		}
		System.out.println("Sum of Odd Digit: "+sum);
	}
	
	public static void countEven(int a) {
		int n=0,count=0;
		while (a>0) {
			n=a%10;
			if(n%2==0) {
				count=count+1;
			}
			a=a/10;
		}
		System.out.println("Count of Even Number: "+count);
	}
	
	public static void FibSeries() {
		int a=0,b=1;
		for(int i=1;i<=10;i++) {
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
		System.out.println();
	}
	
	public static void sqOdd(int a,int b) {
		int sum=0,sq=1;
		for(int i=a;i<=b;i++) {
			if(i%2!=0) {
				sq=i*i;
				sum=sum+sq;
			}
		}
		System.out.println("Sum Of Sqaure Of Odd Number: "+sum);
	}
	
	public static int add(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public static int sub(int a, int b) {
		int c=a-b;
		return c;
	}
	
	public static int mul(int a,int b) {
		int c=a*b;
		return c;
	}
	
	public static double div(int a,int b) {
		return a/b;
	}
	
	public static int mod(int a,int b) {
		return a%b;
	}
	
	public static int count(int a,int b) {
		int count=0;
		for(int i=a;i<=b;i++) {
			if(i%3==0 && i%5==0) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean primeNum(int a) {
		int count=0;
		boolean f1=false;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2) {
			f1=true;
		}
		else {
			f1=false;
		}
		return f1;
	}
	
	public static int countPrime(int a,int b) {
		int count=0;
		boolean b1=false;
		for(int i=a;i<=b;i++) {
			b1=primeNum(i);
			if(b1==true) {
				count++;
			}
		}
		return count;
	}
	
	public static int power(int a,int b) {
		int power=1;
		for(int i=1;i<=b;i++) {
			power=power*b;
		}
		return power;
	}
	
	public static int sumDigit(int a) {
		int sum=0,n=0;
		while(a>0) {
			n=a%10;
			sum=sum+n;
			a=a/10;
		}
		return sum;
	}
	
	public static int countDigit(int a) {
		int count=0,n=0;
		while(a>0) {
			n=a%10;
			count++;
			a=a/10;
		}
		return count;
	}
	
	//Mstrong
	
}
