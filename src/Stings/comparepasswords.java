package Stings;

import java.util.Scanner;

public class comparepasswords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("input a password for your safe");
		String password = input.nextLine();
		System.out.println("reverify the password that you input");
		String verify = input.nextLine();
		while (password.compareTo(verify) != 0) {
			System.out.println("You verified the wrong password try again");
			verify = input.nextLine();
		}
	}

}
