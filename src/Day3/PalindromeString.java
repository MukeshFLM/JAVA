package Day3;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String rev = "";
		int length = input.length()-1;
		for(int i=length; i>=0 ; i--) {
			rev = rev + input.charAt(i);
		}
		if(input.equals(rev)) {
			System.out.println("entered name is palindrome");
		}
		else {
			System.out.println("entered name not a palindrome");
		}

	}

}
