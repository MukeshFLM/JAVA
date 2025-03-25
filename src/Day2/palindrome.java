package Day2;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter palindrome number");
		int number = sc.nextInt();
		int palindrome = 0;
		while(number !=0) {
			int digit = number % 10; //returns reminder
			palindrome = palindrome * 10 +  digit;
			number /= 10;
		}
		System.out.println(palindrome);
		

	}

}
