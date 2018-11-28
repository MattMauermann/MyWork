package Loops;

import java.util.Scanner;

public class isitprimeforloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		int count = 0;
		System.out.println("What is the number that you want to determine if it is prime?");
		num = input.nextInt();
		for (int j = num; j <= num && j > 0; j--) {
			if (num % j == 0) {
				count++;
				// gives the number of divisors for the number that was just tested.
			}
		}
		count = count - 2;
		if (count > 0) {
			System.out.println("This number is not prime");
		} else {
			System.out.println("This number is prime");
		}
	}

}
