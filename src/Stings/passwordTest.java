package Stings;

import java.util.Scanner;

public class passwordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		passwordmain bob = new passwordmain();
		// while (bob.setpassword != true) {
		System.out.println("enter a password in the format Lastname:password");
		String password = input.nextLine();
		password = password.substring(password.indexOf(":") + 1);

		bob.setpassword(password);
	}

}

//}
