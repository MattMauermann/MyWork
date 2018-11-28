package Loops;

import java.util.Random;

public class roll13sideddice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(7);
		int counter = 0;
		int rolls;
		int min = 1;
		int max = 13;
		for (rolls = 1; rolls <= 87; rolls++) {
			int randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum % 3 == 0) {
				counter++;
			}
		}
		System.out.println("The number of multiples of 3 rolled is " + counter);
	}

}
