package Loops;

import java.util.Random;
import java.util.Scanner;

public class computerwinsthelottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("input the 4 lottery numbers");
		int lotto1 = input.nextInt();
		int lotto2 = input.nextInt();
		int lotto3 = input.nextInt();
		int lotto4 = input.nextInt();
		System.out.println("What is the range of lottery numbers? (1-?)");
		int max = input.nextInt();
		int min = 1;
		int guesscounter = 0;
		int randomNum1 = 1;
		int randomNum2 = 0;
		int randomNum3 = 0;
		int randomNum4 = 0;
		while (randomNum1 != lotto1 || randomNum2 != lotto2 || randomNum3 != lotto3 || randomNum4 != lotto4) {
			randomNum1 = min + generator.nextInt(max - min + 1);
			randomNum2 = min + generator.nextInt(max - min + 1);
			randomNum3 = min + generator.nextInt(max - min + 1);
			randomNum4 = min + generator.nextInt(max - min + 1);
			guesscounter++;
		}
		System.out.println("It took " + guesscounter + " tries to win the lottery");
	}

}
