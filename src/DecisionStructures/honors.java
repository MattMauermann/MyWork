package DecisionStructures;

import java.util.Scanner;

public class honors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your class and grade point average?");
		double classage = input.nextDouble();
		double gpa = input.nextDouble();
		if (gpa >= 3.5 && classage == 12) {
			System.out.println("You can graduate with honors");
		} else {
			System.out.println("You can not graduate with honors");
		}
	}

}
