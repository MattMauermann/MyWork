package Arrays;

import java.util.Scanner;

public class sumofarrayvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		Scanner input = new Scanner(System.in);
		for (int counter = 0; counter < 4; counter++) {
			System.out.println("input 5 values to be stored in the array");
			double[] scores = new double[4];
			scores[counter] = input.nextDouble();
			sum = sum + scores[counter];

		}
	}

}
