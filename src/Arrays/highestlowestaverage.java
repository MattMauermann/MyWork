package Arrays;

import java.util.Scanner;

public class highestlowestaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double reserve;
		double highest = 0;
		double lowest = 999;
		double sum = 0;
		double[] bob = new double[10];
		System.out.println("input 10 numbers");
		for (int count = 0; count < 10; count++) {
			reserve = input.nextDouble();
			bob[count] = reserve;
			if (reserve > highest) {
				highest = reserve;
			}
			if (reserve < lowest) {
				lowest = reserve;
			}
			sum = sum + reserve;
		}
		System.out.println("The highest is " + highest);
		System.out.println("the lowest is " + lowest);
		System.out.println("The average is " + sum / 10);
		System.out.println(bob[0] + " " + bob[1] + " " + bob[2] + " " + bob[3] + " " + bob[4] + " " + bob[5] + " "
				+ bob[6] + " " + bob[7] + " " + bob[8] + " " + bob[9]);

	}

}
