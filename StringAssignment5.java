package StringAssignment;

public class StringAssignment5 {

	public static void main(String[] args) {
		String str = "Javaj";
		str = str.toLowerCase(); //Convert string to lowercase
		char[] chararray = str.toCharArray(); //Convert string to characters
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(chararray[i] == chararray[j]) {
					System.out.print(chararray[i]+"");
					break;
				}
			}
		}
	}
}