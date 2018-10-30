package DecisionStructures;

import java.util.Scanner;

public class testgradesandteacherniceness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your test average?");
		double testaverage = input.nextDouble();
		System.out.println("What is your homework average?");
		double homeworkaverage = input.nextDouble();
		System.out.println("Is your teacher nice?");
		boolean niceness = input.nextBoolean();
		if (niceness == true) {
			if (homeworkaverage > testaverage) {
				System.out.println("Your grade in the class is " + homeworkaverage);
			} else {
				System.out.println("Your grade in the class is " + testaverage);
			}
		} else {

			if (homeworkaverage < testaverage) {
				System.out.println("Your grade in the class is " + homeworkaverage);
			} else {
				System.out.println("Your grade in the class is " + testaverage);
			}
		}

	}
}