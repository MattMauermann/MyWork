package Loops;

import java.util.Scanner;

public class dowhilesumofvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Give us two numbers to add together or 999 to end");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int sum;
		do {
			sum = num1 + num2;
			System.out.println("Your sum is " + sum);
			System.out.println("Give us two numbers to add together or 999 to end");
			num1 = input.nextInt();
			num2 = input.nextInt();
		} while (num1 != 999);
	}

}
