package Arrays;

import java.util.Random;
import java.util.Scanner;

public class objectcrazysale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int min = 0;
		int max = 100;

		double[] object1 = new double[1];
		System.out.println("What is the price of the first item?");
		object1[0] = input.nextDouble();
		int randomNum = min + generator.nextInt(max - min + 1);
		randomNum = 100 - randomNum;
		double randomNumre = randomNum / 100;
		double givemethegoods = object1[0];
		System.out.println("the new price is " + givemethegoods * randomNumre);

		double[] object2 = new double[1];
		System.out.println("What is the price of the second item?");
		object2[0] = input.nextDouble();
		int randomNum2 = min + generator.nextInt(max - min + 1);
		randomNum2 = 100 - randomNum2;
		double randomNumre1 = randomNum2 / 100;
		double givemethegoods2 = object2[0];
		System.out.println("the new price is " + givemethegoods2 * randomNumre1);
	}

}
