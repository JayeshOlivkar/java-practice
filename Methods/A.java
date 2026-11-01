package Methods_1;

public class A {

	public void Add(int a, int b) {
		System.out.println("Addition: " + a + b);
	}

	public void sub(int a, int b) {
		System.out.println("Subtraction: " + (a - b));
	}

	public void mul(int a, int b) {
		System.out.println("Multiplication: " + a * b);
	}

	public void div(int a, int b) {
		System.out.println("Division: " + a / b);
	}

	public void mod(int a, int b) {
		System.out.println("Mod: " + a % b);
	}

	public void sq(int a) {
		System.out.println("Square: " + a * a);
	}

	public void cube(int a) {
		System.out.println("Cube: " + a * a * a);
	}

	public void A() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public void B(int a, int b) {
		System.out.println("Even: ");
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
	}

	public void C(int a, int b) {
		System.out.println("Odd: ");
		for (int i = a; i <= b; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void D(int a, int b) {
		for(int i=a;i<=b;i++) {
			System.out.print(i*i*i+" ");
		}
		System.out.println();
	}
	
	public void E(int a) {
		int n=0,sum=0;
		while(a>0) {
			n=a%10;
			sum=sum+n;
			a=a/10;
		}
		System.out.println("Sum: "+sum);
		System.out.println();
	}
	
	public void F(int a) {
		int n=0,count=0;
		while(a>0) {
			n=a%10;
			count++;
			a=a/10;
		}
		System.out.println("Count: "+count);
		System.out.println();
	}
}
