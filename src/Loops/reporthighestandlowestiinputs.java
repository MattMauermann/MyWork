package Loops;

import java.util.Scanner;

public class reporthighestandlowestiinputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int highest = 0;
		int lowest = 999;
		int user = 0;
		while (user != 9999) {
			System.out.println("What is your test score or enter 9999 to end");
			user = input.nextInt();
			if (user != 9999) {
				if (user > highest) {

					highest = user;
				}
			}
			if (user < lowest) {
				lowest = user;

			}
		}
		System.out.println("The highest is" + highest);
		System.out.println("The lowest is " + lowest);

	}

}
