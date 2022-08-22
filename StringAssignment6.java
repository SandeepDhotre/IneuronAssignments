package StringAssignment;

import java.util.Scanner;
import java.util.Arrays;

public class StringAssignment6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:- ");
		String str = sc.nextLine();
		char[] chararray = str.toCharArray(); //Convert String into characters.
		Arrays.sort(chararray); //Sort array using inbuilt Arrays class sort method
		System.out.println(new String(chararray));
		sc.close();
	}
}