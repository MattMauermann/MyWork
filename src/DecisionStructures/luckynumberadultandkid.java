package DecisionStructures;

import java.util.Scanner;

public class luckynumberadultandkid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age and weight and height");
		double age = input.nextInt();
		double weight = input.nextDouble();
		double height = input.nextDouble();
		double luckynumber;
		if (age >= 18) {
			luckynumber = height * 5;
			System.out.println("lucky number:" + luckynumber);
		} else {
			luckynumber = weight / 2;
			System.out.println("Lucky number" + luckynumber);
		}
	}

}
