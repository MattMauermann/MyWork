//prompt for 250 scores and display the largest
package Stings;

import java.util.Scanner;

public class promptuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] scores = new double[100];
		double largest = 0;
		System.out.println("input some test scores");
		for (int count = 0; count < 100; count++) {
			scores[count] = input.nextDouble();
			if (scores[count] > largest) {
				largest = scores[count];
			}

		}
		System.out.println("the number of elements in this array is " + scores.length);
		System.out.println(largest);

	}

}
