package Arrays;

import java.util.Random;
import java.util.Scanner;

public class fillrandomlargearrayandtestforvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int max = 100;
		int addup = 0;
		int min = 1;
		int[] object1 = new int[10000];
		for (int count = 0; count < 10000; count++) {
			object1[count] = min + generator.nextInt(max - min + 1);
		}
		System.out.println("What integer do you want to test the number of?");
		int check = input.nextInt();
		for (int counter = 0; counter < 10000; counter++) {
			if (object1[counter] == check) {
				addup++;
			}
		}
		System.out.println("That number was selected " + addup + " times");
	}

}
