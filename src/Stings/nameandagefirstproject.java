package Stings;

import java.util.Scanner;

public class nameandagefirstproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		String age = input.next();
		// you have to clear the buffer so that the program will continue to search for
		// content
		input.nextLine();
		System.out.println("What is your full name?");
		String name = input.nextLine();
		System.out.println(age);
	}

}
