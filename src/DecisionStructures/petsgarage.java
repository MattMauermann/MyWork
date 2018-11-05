package DecisionStructures;

import java.util.Scanner;

public class petsgarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many cars fit in your garage and how many pets do you have?");
		int cars = input.nextInt();
		int pets = input.nextInt();
		System.out.println(pets >= 5 || cars > 3);
	}

}
