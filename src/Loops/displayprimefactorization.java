package Loops;

import java.util.Scanner;

public class displayprimefactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int num = 0;
		int count = 0;
		System.out.println("What is the number that you want to get the prime factorization of?");
		num = input.nextInt();
		for (int j = num; j <= num && j > 0; j--) {
			if (num % j == 0) {
				if (j != num) {
					for (count = 1; count <= j; count++) {
						if (j % count == 0) {

							System.out.println("One factor of this is " + j);

						}
					}
				}
			}
		}
	}

}
