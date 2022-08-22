package StringAssignment;

public class StringAssignment1 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("iNeuron");
		
		//1st way to reverse the string.
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		//2nd way to reverse the string.
		for(int i=0;i<str.length()/2;i++) {
			int frontIndex=i;
			int backIndex=str.length()-1-i;
			char frontChar = str.charAt(frontIndex);
			char backChar = str.charAt(backIndex);
			//Swap front character to back and back character to front
			str.setCharAt(frontIndex, backChar);
			str.setCharAt(backIndex, frontChar);
		}
		System.out.println("\n"+str);
	}
}