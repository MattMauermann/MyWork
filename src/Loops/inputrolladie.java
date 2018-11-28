package Loops;

import java.util.Random;
import java.util.Scanner;

public class inputrolladie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("How many sides are on the die and how many times do you want to roll the die?");
		int sides = input.nextInt();
		int rolls = input.nextInt();
		int min = 1;
		int max = sides;
		int count = 0;
		for (count = 1; count <= rolls; count++) {
			int randomNum = min + generator.nextInt(max - min + 1);
			System.out.println("This roll output " + randomNum);
		}

	}

}
