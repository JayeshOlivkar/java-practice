package seriesHM;

public class c {
	public static void main(String[] args) {
		int a=2;
		int b=4;
		for(int i=1;i<=12;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			else {
				System.out.print(a+" ");
				int c=a+b;
				a=b;
				b=c;
			}
		}
	}
}
