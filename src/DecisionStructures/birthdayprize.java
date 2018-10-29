package DecisionStructures;

import java.util.Scanner;

public class birthdayprize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much money did you receive for your fifth birthday?");
		double money = input.nextDouble();
		double askmoney = Math.sqrt(84.3);
		final double epsilon = 0.01;
		if (Math.abs(money - askmoney) < epsilon) {
			System.out.println("You get a good prize");
		} else {
			System.out.println("You get a bad prize");
		}
	}

}
