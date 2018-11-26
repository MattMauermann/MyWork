package Loops;

import java.util.Random;

public class Yahtzeeversion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int trialscount = 0;
		int min = 1;
		int max = 6;
		int randomNum1 = 1;
		int randomNum2 = 0;
		int randomNum3 = 0;
		int randomNum4 = 0;
		int randomNum5 = 0;
		while (randomNum1 != randomNum2 || randomNum1 != randomNum3 || randomNum1 != randomNum4
				|| randomNum1 != randomNum5) {
			randomNum1 = min + generator.nextInt(max - min + 1);
			randomNum2 = min + generator.nextInt(max - min + 1);
			randomNum3 = min + generator.nextInt(max - min + 1);
			randomNum4 = min + generator.nextInt(max - min + 1);
			randomNum5 = min + generator.nextInt(max - min + 1);
			trialscount++;
		}
		System.out.println("It took a total of " + trialscount + " tries to get a yahtzee");
	}

}
