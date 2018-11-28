package Loops;

import java.util.Random;

public class minimumrollsfor100yahtzees {

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
		int yahtzeecounter = 0;
		int mintrials = 99999999;
		for (yahtzeecounter = 1; yahtzeecounter <= 100; yahtzeecounter++) {
			trialscount = 0;
			while (randomNum1 != randomNum2 || randomNum1 != randomNum3 || randomNum1 != randomNum4
					|| randomNum1 != randomNum5) {
				randomNum1 = min + generator.nextInt(max - min + 1);
				randomNum2 = min + generator.nextInt(max - min + 1);
				randomNum3 = min + generator.nextInt(max - min + 1);
				randomNum4 = min + generator.nextInt(max - min + 1);
				randomNum5 = min + generator.nextInt(max - min + 1);
				trialscount++;
			}
			if (trialscount < mintrials) {
				mintrials = trialscount;
			}

		}
		System.out.println("the lowest number of trials that it took to get a yahtzee is " + mintrials);
	}
}
