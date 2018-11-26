package Loops;

import java.util.Scanner;

public class calculatornestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		while (num != 5) {
			System.out.println(
					"1. test if right triangle; 2. find the square root; 3. find the number rounded up; 4. find the number rounded down; 5. quit the calculator");
			System.out.println("choose an option");
			num = input.nextInt();

			if (num == 1) {
				System.out.println("What are the 3 lengths of the triangle?");
				int sideone = input.nextInt();
				int sidetwo = input.nextInt();
				int sidethree = input.nextInt();
				if ((sideone + sidetwo) > sidethree && (sidetwo + sidethree) > sideone
						&& (sideone + sidethree) > sidetwo) {
					System.out.println("This can be a right triangle");
				}
			}
			if (num == 2) {
				System.out.println("Input a number to find the square root of");
				double sqrt = input.nextDouble();
				sqrt = Math.sqrt(sqrt);
				System.out.println(sqrt + "is the square root");
			}
			if (num == 3) {
				System.out.println("Insert a number that you want to round up");
				double rndup = input.nextDouble();
				rndup = Math.ceil(rndup);
				System.out.println(rndup + "is the rounded up version of the number");
			}
			if (num == 4) {
				System.out.println("Insert a number that you want to round down");
				double rnddown = input.nextDouble();
				rnddown = Math.floor(rnddown);
				System.out.println(rnddown + "is the rounded down version of the number");
			}
		}
	}
}
