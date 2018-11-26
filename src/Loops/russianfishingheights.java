package Loops;

import java.util.Random;

public class russianfishingheights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(0);
		int counter = 0;
		int kids;
		int min = 26;
		int max = 43;
		for (kids = 1; kids <= 248; kids++) {
			int randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum > 36) {
				counter++;
			}
		}
		System.out.println("The number of kids over 3 feet tall is " + counter);
	}

}
