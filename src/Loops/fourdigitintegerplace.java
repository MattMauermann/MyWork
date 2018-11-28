package Loops;

import java.util.Scanner;

public class fourdigitintegerplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double integer = 0;
		double user = 0;
		while (user != -1) {
			System.out.println("Enter a four digit integer number");
			user = input.nextDouble();
			user = user * 100;
			integer = (int) user / 1;
			integer = integer / 100;
			System.out.println("Your rounded answer is " + integer);
		}
	}

}
