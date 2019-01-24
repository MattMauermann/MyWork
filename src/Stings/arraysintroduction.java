package Stings;

import java.util.Scanner;

public class arraysintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] scores = new double[5];

		for (int count = 0; count < 5; count++) {
			System.out.println("input some scores");
			scores[count] = input.nextDouble();
		}
		for (int count = 0; count < 5; count++) {
			System.out.println(scores[count]);
		}
		for (int count = 4; count > 0; count--) {
			System.out.println(scores[count]);
		}
	}

}
