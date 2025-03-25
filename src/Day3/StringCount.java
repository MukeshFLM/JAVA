package Day3;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int count = 0;
		for(int i = input.length(); i <= input.length()-1; i--) {
			System.out.println(input.charAt(i-1)); 
		}


	}

}
