package Loops;

import java.util.Scanner;

public class displayoddvalueslessthaninput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the number that you want to use?");
		int user = input.nextInt();
		int count = 0;
		if (user % 2 == 1) {
			for (count = user; count >= 0; count = count - 2) {
				System.out.println(user);
				user = user - 2;
			}
		} else {
			user = user - 1;
			for (count = user; count >= 0; count = count - 2) {
				System.out.println(user);
				user = user - 2;
			}
		}
	}
}
