package Arrays;

import java.util.Random;
import java.util.Scanner;

public class roll10000extension {

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
			System.out.println("what number roll do you want to test");
			i = input.nextInt();
			for (int count = 0; count < 10000; count++) {
				if (dice[count] == 'i')
					System.out.println(count);
			}

		}
	}

}
