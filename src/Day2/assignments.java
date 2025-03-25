package Day2;

import java.util.Scanner;

public class assignments {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");

		int input = sc.nextInt();
		int reversed = 0;
		
		while(input !=0) {
			int reminder = input % 10; //it stores reminder
			reversed = reversed * 10 + reminder;
			input /= 10;
		}
		System.out.println(reversed);
		
	}

}
