package DecisionStructures;

import java.util.Scanner;

public class wageemploymentdefinement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your wage?");
		double wage = input.nextDouble();
		if (wage < 20000) {
			System.out.println("You must be a worker");
		} else if (wage > 20000 && wage < 40000) {
			System.out.println("You must be a manager");
		}
		if (wage > 40000 && wage <= 100000) {
			System.out.println("You must be a ceo");
		}
		if (wage > 100000) {
			System.out.println("You must be the owner");
		}
	}

}
//in order to nest the else statements, do not close your else statements until the very end of the program