package StringAssignment;

import java.util.Arrays;

public class StringAssignment3 {
	static void isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
		boolean result = true;
		// Check for the length & length of both string should be equal.
		if(s1.length()!=s2.length()) {
			result = false;
		}else {
			// convert strings to char array
			char[] charArray1 = s1.toLowerCase().toCharArray();
			char[] charArray2 = s2.toLowerCase().toCharArray();
			// sort the char array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			// if sorted char arrays are same then the string is anagram
			result = Arrays.equals(charArray1, charArray2);
		}
		if(result)
			System.out.println(str1+" and "+str2+" are anagram.");
		else
			System.out.println(str1+" and "+str2+" are not anagram.");
	}
	public static void main(String[] args) {
		//Call Anagram method
		isAnagram("Below","Elbow");
	}
}