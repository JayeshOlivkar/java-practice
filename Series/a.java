package seriesHM;

public class a {
	public static void main(String[] args) {
		char a='A',b='a';
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.print(a+" ");
			}
			else {
				System.out.print(b+" ");
			}
			a++;
			b++;
		}
	}
}
