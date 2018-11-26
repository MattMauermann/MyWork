package Loops;

import java.util.Scanner;

public class displaydivisorsforloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		int count = 0;
		System.out.println("What is the number that you want to find the divisors of?");
		num = input.nextInt();
		for (int j = num; j <= num && j > 0; j--) {
			if (num % j == 0) {
				count++;
				// gives the number of divisors for the number that was just tested.
			}
		}
		System.out.println("This number has " + count + " divisors");
	}
}
