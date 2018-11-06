package Loops;

import java.util.Scanner;

public class twotimesinputvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int userinput;
		System.out.println("Input a value");
		userinput = input.nextInt();
		while (userinput != 999) {

			System.out.println("Two times your number is " + 2 * userinput);
			System.out.println("Input a value");
			userinput = input.nextInt();
		}
	}

}
