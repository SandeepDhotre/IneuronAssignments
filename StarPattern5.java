public class StarPattern5 {
	public static void main(String[] args) {
		int rows = 7;
		for(int i=1;i<=rows*2;i++) System.out.print("*"); //Print star at 1st line with rows*2 times.
		System.out.println();
		for(int i=rows-1;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=rows;i++) {
			if(i!=1) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
			System.out.println();
			}
		}
		for(int i=1;i<=rows*2;i++) System.out.print("*"); //Print star at last line with rows*2 times.
	}
}