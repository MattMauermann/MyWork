package Loops;

import java.util.Scanner;

public class outputnumberofvaluesinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		int count = 0;
		int user;
		System.out.println("input a value");
		user = input.nextInt();
		num = num + user;
		count++;
		do {
			System.out.println("input a value");
			user = input.nextInt();
			num = num + user;
			count++;

		} while (num < 2018);
		System.out.println("The number of values input is " + count);
	}

}
