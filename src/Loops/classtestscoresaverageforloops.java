package Loops;

import java.util.Scanner;

public class classtestscoresaverageforloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many people took the test?");
		int testtakers = input.nextInt();
		int count = 0;
		double sum = 0;
		double scores;
		double average = 0;
		for (count = testtakers; count > 0; count = count - 1) {
			System.out.println("What is the score on one student's test?");
			scores = input.nextInt();
			sum = sum + scores;
		}
		average = sum / testtakers;
		System.out.println("The average score was " + average);
	}

}
