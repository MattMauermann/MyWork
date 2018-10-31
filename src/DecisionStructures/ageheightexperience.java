package DecisionStructures;

import java.util.Scanner;

public class ageheightexperience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		System.out.println("What is your years of experience?");
		double experience = input.nextDouble();
		System.out.println("What is your height in inches?");
		double height = input.nextDouble();
		if (age >= 50 && experience == 10.5 && height <= 70) {
			System.out.println("You are getting a promotion");
		} else {
			if (age >= 50 && experience == 10.5 && height >= 80) {
				System.out.println("You are getting a promotion");
			} else {
				if (age < 50 && height >= 70 && height <= 80) {
					System.out.println("You are getting a promotion");
				} else {
					System.out.println("You are a bum. No promotions for bums");
				}
			}
			// if Math.abs(experience-10.5)<0.00000000000001)
		}
	}

}
