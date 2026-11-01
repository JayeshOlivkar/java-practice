package MethodHM;



public class A {

	public void mul(int a) {
		int n = 0, mul = 1;
		while (a > 0) {
			n = a % 10;
			mul = mul * n;
			a = a / 10;
		}
		System.out.println("Multiplication: " + mul);
		System.out.println();
	}

	public void poli(int a) {
		int n = 0, rev = 0;
		int b = a;
		while (a > 0) {
			n = a % 10;
			rev = (rev * 10) + n;
			a = a / 10;

		}
		if (rev == b) {
			System.out.println("Number is Polindrome");
		} else {
			System.out.println("Number is not Polindrom");
		}
		System.out.println();
	}

	public void even(int a) {
		if (a % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is not Even");
		}
		System.out.println();
	}

	public void fact(int a) {
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
	}

	public void SumFact(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum: " + sum);
		System.out.println();
	}

	public void Perfect(int a) {
		int sum = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == a) {
			System.out.println("Number is Perfect Number");
		} else {
			System.out.println("Number is not Perfect Number");
		}
		System.out.println();
	}

	public void Bingo(int a) {
		int n = 0;
		int b = a;
		while (a > 0) {
			n = a % 10;
			if (n == 7) {
				System.out.println("7 is in Number");
			} else {
				if (b % 7 == 0) {
					System.out.println("Number is Bingo Number");
					break;
				}
			}
			a = a / 10;
		}

	}
	

}
