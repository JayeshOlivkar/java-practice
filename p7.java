package patternHM;

public class p7 {
	public static void main(String[] args) {
		for(int r=1;r<=7;r++) {
			int n;
			if(r==1) {
				n=1;
			}
			else {
				n=9-r;
			}
			for(int c=1;c<=7;c++) {
				System.out.print(n+" ");
				n++;
				if(n>7) {
					n=1;
				}
				
			}
			System.out.println();
		}
	}
}
