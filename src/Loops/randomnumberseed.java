package Loops;

import java.util.Random;

public class randomnumberseed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(5);
		int max = 100;
		int min = 0;

		int randomNum = min + generator.nextInt(max - min + 1);

		System.out.println("The random number starting at this seed is " + randomNum);

	}

}
