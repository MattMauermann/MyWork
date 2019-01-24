package Arrays;

import java.util.Random;
import java.util.Scanner;

public class rolldicemultidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("How many kids are in the class");
		int kids = input.nextInt();
		System.out.println("How many sides are on the dice?");
		int sides = input.nextInt();
		System.out.println("How many times should each student roll the dice?");
		int rolls = input.nextInt();
		int[][] students = new int[kids][rolls];
		int min = 1;
		int max = sides;
		int numtimes = 0;
		for (int s = 0; s < kids; s++) {
			for (int r = 0; r < rolls; r++) {
				int randomNum = min + generator.nextInt(max - min + 1);
				students[s][r] = randomNum;
			}
		}
		System.out.println();
		for (int s = 0; s < kids; s++) {
			for (int r = 0; r < rolls; r++) {
				System.out.println(students[s][r]);
			}
		}
		System.out.println("What is the value that you want to test for");
		int test = input.nextInt();
		for (int s = 0; s < kids; s++) {
			for (int r = 0; r < rolls; r++) {
				if (students[s][r] == test) {
					numtimes++;
				}

			}
		}
		System.out.println("That number was displayed " + numtimes + " times");
	}
}
