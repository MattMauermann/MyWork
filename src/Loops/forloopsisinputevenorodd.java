package Loops;

import java.util.Scanner;

public class forloopsisinputevenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int user;
		for (counter = 1; counter <= 5; counter++) {
			System.out.println("input a value");
			user = input.nextInt();
			if (user % 2 == 0) {
				System.out.println("this value is even");
			}
		}
	}

}
