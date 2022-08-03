public class StarPattern4 {
	public static void main(String[] args) {
		int rows = 7;
		for(int i=1;i<=rows+1;i++) { //Outer Loop will run for n rows times.
			//print star
			if(i==rows+1) {
				for(int j=1;j<=i-1;j++) { //Loop
					System.out.print("*");
				}
			}else {
				for(int j=1;j<=i;j++) { //Loop
					System.out.print("*");
				}
			}
			int spaces = 2 * (rows-i);
			//print spaces
			for(int j=1;j<=spaces;j++) { //Loop
				System.out.print(" ");
			}
			//print star
			if(i==rows+1) {
				for(int j=1;j<=i-1;j++) { //Loop
					System.out.print("*");
				}
			}else {
				for(int j=1;j<=i;j++) { //Loop
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}