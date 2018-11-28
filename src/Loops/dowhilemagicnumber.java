package Loops;

import java.util.Scanner;

public class dowhilemagicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int userinput = 0;
		System.out.println("What is your number?");
		userinput = input.nextInt();

		do {
			System.out.println("Your magic number is " + userinput * 17);
			System.out.println("What is your number?");
			userinput = input.nextInt();

		} while (userinput != 9999);
	}

}
