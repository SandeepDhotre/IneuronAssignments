package StringAssignment;

public class StringAssignment7 {

	public static void main(String[] args) {
		String str = "You are really a great person";
		int vowelscount=0;
		int consonantscount=0;
		str = str.toLowerCase(); //Convert string to lower case
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if( ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' ) { //Check if character is a e i o u
				vowelscount++;
			}else if( ch >= 'a' && ch <= 'z' ){
				consonantscount++;
			}
		}
		System.out.println("Total Vowel count is:- "+vowelscount);
		System.out.println("Total Consonants count is:- "+consonantscount);
	}
}