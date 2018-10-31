package DecisionStructures;

import java.util.Scanner;

public class temperatureandsports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the temperature outside?");
		int temperature = input.nextInt();
		if (temperature > 83) {
			System.out.println("You should go swimming");
		} else {
			if (temperature > 74 && temperature <= 83) {
				System.out.println("You should play tennis");
			} else {
				if (temperature > 35 && temperature <= 74) {
					System.out.println("You should go golfing");
				} else {
					if (temperature > -10 && temperature <= 35) {
						System.out.println("You should go snow shoeing");
					} else {
						if (temperature <= -10) {
							System.out.println("You should do no sports or outdoor activities of any kind");
						}
					}
				}
			}
		}
	}

}
