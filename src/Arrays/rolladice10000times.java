package Arrays;

import java.util.Random;
import java.util.Scanner;

public class rolladice10000times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();

		int min = 1;
		int max = 6;
		int i = 0;
		int[] dice = new int[10000];
		for (int counter = 0; counter < 10000; counter++) {
			int randomNum = min + generator.nextInt(max - min + 1);

			dice[counter] = randomNum;
		}
		while (i != 10001) {
			System.out.println("what number roll do you want");
			i = input.nextInt();
			System.out.println(dice[i]);
		}
	}

}
