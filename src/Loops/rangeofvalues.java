package Loops;

import java.util.Scanner;

public class rangeofvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int highest = 0;
		int lowest = 999;
		int user = 0;
		do {
			System.out.println("What is your input or enter 9999 to end");
			user = input.nextInt();
			if (user != 9999) {
				if (user > highest) {

					highest = user;
				}
			}
			if (user < lowest) {
				lowest = user;

			}
		} while (user != 9999);
		int range = highest - lowest;
		System.out.println("The range is " + range);

	}

}
