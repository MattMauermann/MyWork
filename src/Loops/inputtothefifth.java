package Loops;

import java.util.Scanner;

public class inputtothefifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int uservalue = 0;
		System.out.println("What is your number?");
		uservalue = input.nextInt();
		do {
			System.out.println("Your magic number is " + uservalue * uservalue * uservalue * uservalue * uservalue);
			System.out.println("What is your magic number");
			uservalue = input.nextInt();
		} while (uservalue != 9999);
	}

}
