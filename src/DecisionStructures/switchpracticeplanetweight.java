package DecisionStructures;

import java.util.Scanner;

public class switchpracticeplanetweight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your weight?");
		double weight = input.nextDouble();
		System.out.println("Choose a planet: 1.Mercury, 2.Venus, 3.Mars, 4.Jupiter, 5.Saturn");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("You would weigh " + weight * .37 + " pounds on Mercury");
			break;
		case 2:
			System.out.println("You would weigh " + weight * .88 + "pounds on earth");
			break;
		case 3:
			System.out.println("You would weigh " + weight * .38 + "pounds on mars");
			break;
		case 4:
			System.out.println("You would weight " + weight * 2.64 + "pounds on Jupiter");
			break;
		case 5:
			System.out.println("You would weigh " + weight * 1.15 + "pounds on saturn");
			break;
		default:
			System.out.println("you chose an invalid number");
			break;
		}

	}

}
