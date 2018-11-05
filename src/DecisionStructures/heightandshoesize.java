package DecisionStructures;

import java.util.Scanner;

public class heightandshoesize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your shoe size and what is your height?");
		double height = input.nextDouble();
		double shoe = input.nextDouble();

		System.out.println(height + shoe >= 26);
	}

}
