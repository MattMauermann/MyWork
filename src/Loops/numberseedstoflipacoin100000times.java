package Loops;

import java.util.Random;

public class numberseedstoflipacoin100000times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(42);
		int min = 0;
		int max = 1;
		int count = 0;
		int heads = 0;
		int tails = 0;
		for (count = 1; count <= 100000; count++) {
			int randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum == 0) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("the number of heads is " + heads + " and the number of tails is " + tails);
	}

}
