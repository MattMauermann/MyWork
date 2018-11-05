package DecisionStructures;

import java.util.Scanner;

public class multipledcisionsshoeandheight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your height and shoe");
		double height = input.nextDouble();
		double shoe = input.nextDouble();

		System.out.println(height < 62 && shoe > 9);
	}

}
