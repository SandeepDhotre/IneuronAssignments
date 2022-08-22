package StringAssignment;

public class StringAssignment8 {

	public static void main(String[] args) {
		String str = new String("*1ab34cd!@#@#$%^*Sandeep%$123$)");
		int splcharcount=0;
		for(int i=0;i<str.length();i++) {
			boolean isAlpha = Character.isAlphabetic(str.charAt(i)); //Check if the character is alphabetic or not. 
			boolean isDigi = Character.isDigit(str.charAt(i)); //Check if the character is numeric or not.
			if(isAlpha || isDigi) {} else splcharcount++; //If the character do contain alphabetic & numeric then increase the count
		}
		System.out.println("Total number of special characters are:- "+splcharcount);	
	}
}