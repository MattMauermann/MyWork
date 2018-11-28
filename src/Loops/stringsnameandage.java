package Loops;

import java.util.Scanner;

public class stringsnameandage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		String age = input.next();
		System.out.println("What is your full name?");
		String name = input.nextLine();
		System.out.println(age);
	}

}
