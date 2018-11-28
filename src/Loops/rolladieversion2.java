package Loops;

import java.util.Random;
import java.util.Scanner;

public class rolladieversion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("How many times do you want to roll the 6 sided die");
		int numrolls = input.nextInt();
		int min = 1;
		int max = 6;
		double onecount = 0;
		double twocount = 0;
		double threecount = 0;
		double fourcount = 0;
		double fivecount = 0;
		double sixcount = 0;
		double rollcounter;
		for (rollcounter = 1; rollcounter <= numrolls; rollcounter++) {
			int randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum == 1) {
				onecount++;
			}
			if (randomNum == 2) {
				twocount++;
			}
			if (randomNum == 3) {
				threecount++;
			}
			if (randomNum == 4) {
				fourcount++;
			}
			if (randomNum == 5) {
				fivecount++;
			}
			if (randomNum == 6) {
				sixcount++;
			}

		}
		double onepercent = ((onecount / numrolls) * 100);
		System.out.println(
				"You rolled a 1 " + onecount + " times which is equal to " + onepercent + " percent of the time");
		double twopercent = ((twocount / numrolls) * 100);
		System.out.println(
				"You rolled a 2 " + twocount + " times which is equal to " + twopercent + " percent of the time");
		double threepercent = ((threecount / numrolls) * 100);
		System.out.println(
				"You rolled a 2 " + threecount + " times which is equal to " + threepercent + " percent of the time");
		double fourpercent = ((fourcount / numrolls) * 100);
		System.out.println(
				"You rolled a 4 " + fourcount + " times which is equal to " + fourpercent + " percent of the time");
		double fivepercent = ((fivecount / numrolls) * 100);
		System.out.println(
				"You rolled a 5 " + fivecount + " times which is equal to " + fivepercent + " percent of the time");
		double sixpercent = ((sixcount / numrolls) * 100);
		System.out.println(
				"You rolled a 6 " + sixcount + " times which is equal to " + sixpercent + " percent of the time");

	}

}
