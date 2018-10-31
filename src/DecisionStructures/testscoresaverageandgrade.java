package DecisionStructures;

import java.util.Scanner;

public class testscoresaverageandgrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Input 3 test scores");
		double test1 = input.nextDouble();
		double test2 = input.nextDouble();
		double test3 = input.nextDouble();
		double average = (test1 + test2 + test3) / 3;
		if (average >= 92.5) {
			System.out.println("You get an A");
		} else {
			if (average < 92.5 && average >= 84.5) {
				System.out.println("You get a B");
			} else {
				if (average < 84.5 && average >= 77.5) {
					System.out.println("You get a C");
				} else {
					if (average < 77.5 && average >= 69.5) {
						System.out.println("You get a D");
					} else {
						if (average < 69.5) {
							System.out.println("You get an F");
						}
					}
				}
			}
		}
	}

}
