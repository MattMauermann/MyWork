package DecisionStructures;

import java.util.Scanner;

public class peopleandhelicoptersurvival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many people need to be saved");
		int people = input.nextInt();
		int remainder = people % 10;
		if (remainder == 0) {
			System.out.println("The mission was successful");
		} else {
			if (remainder > 0) {
				System.out.println("You left " + remainder + "people behind");
				System.out.println("They gonna die now");
			}
		}
	}

}
