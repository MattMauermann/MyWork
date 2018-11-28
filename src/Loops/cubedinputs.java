package Loops;

import java.util.Scanner;

public class cubedinputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int user = 0;
		while (user != -1) {
			System.out.println("What is your input?");
			user = input.nextInt();
			System.out.println("Your input cubed is " + user * user * user);
		}
	}

}
