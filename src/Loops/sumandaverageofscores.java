package Loops;

import java.util.Scanner;

public class sumandaverageofscores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double user = 0;
		double sum = 0;
		int count = 0;
		double avg = 0;
		while (user != 9999) {
			System.out.println("What is the score of one of your tests? enter 9999 to end calculations");
			user = input.nextDouble();
			if (user >= 69) {
				sum = sum + user;
				count++;
			}
		}
		sum = sum - 9999;
		count = count - 1;
		avg = sum / count;
		System.out.println("The sum of the scores is" + sum + "and the average score was " + avg);

	}

}
