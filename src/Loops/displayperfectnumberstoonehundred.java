package Loops;

import java.util.Scanner;

public class displayperfectnumberstoonehundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		int count = 0;
		for (num = 0; num <= 100; num++) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count = count + i;
					if (count == num) {
						System.out.println(num);
					}
				}
				// gives the number of divisors for the number that was just tested.

			}
		}
	}
//broken
}
