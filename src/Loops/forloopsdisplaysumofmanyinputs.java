package Loops;

import java.util.Scanner;

public class forloopsdisplaysumofmanyinputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int sum = 0;
		int user;
		for (counter = 1; counter <= 10000; counter++) {
			System.out.println("input a value");
			user = input.nextInt();
			sum = sum + user;
		}
		System.out.println(sum);
	}

}
