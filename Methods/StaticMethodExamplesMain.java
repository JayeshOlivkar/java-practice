package TypesOFMethods;

public class A_main {
	public static void main(String[] args) {
		A.sumOdd(123456);
		A.countEven(123456789);
		A.FibSeries();
		A.sqOdd(1,10);
		System.out.println();
		int a=A.add(5, 9);
		int b=A.sub(50, 40);
		int c=A.mul(5, 4);
		double d=A.div(9, 2);
		int e=A.mod(55, 2);
		System.out.println("Addition: "+a);
		System.out.println("Substraction: "+b);
		System.out.println("Multiplication: "+c);
		System.out.println("Division: "+d);
		System.out.println("Mod: "+e);
		System.out.println();
		int f=A.count(1, 20);
		System.out.println("Count: "+f);
		boolean g=A.primeNum(6);
		if(g==true) {
			System.out.println("Prime Number "+g);
		}
		else {
			System.out.println("Not a Prime Number");
		}
		
		int h=A.countPrime(1, 10);
		System.out.println("Count of Prime Number: "+h);
		int i=A.power(3, 4);
		System.out.println("Power: "+i);
		int j=A.sumDigit(123456);
		System.out.println("Sum: "+j);
		int k=A.countDigit(123455);
		System.out.println("Count: "+k);
		
	}
}
