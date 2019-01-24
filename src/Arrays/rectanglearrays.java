package Arrays;

import java.util.Random;
import java.util.Scanner;

import ObjectOrientedProgramming.rectangle;

public class rectanglearrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		for (int counter = 0; counter < 100; counter++) {
			rectangle bob = new rectangle();
			Random generator = new Random();
			int min = 10;
			int max = 56;
			int width = min + generator.nextInt(max - min + 1);
			int length = min + generator.nextInt(max - min + 1);
			bob.area();
			System.out.println("The area is " + bob.area());
			System.out.println("The width is " + width + " and the length is " + length);
		}
	}

}
