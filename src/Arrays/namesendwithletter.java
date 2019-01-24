package Arrays;

import java.util.Scanner;

public class namesendwithletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		System.out.println("Enter the names of 20 friends");
		String[] friends = new String[20];
		for (counter = 0; counter >= 19; counter++) {
			friends[counter] = input.nextLine();

		}
		System.out.println("What is the letter that you want to test?");
		String testChar = input.nextLine();

//int length=testChar.length();
//testChar=charAt(length);
	}

}
