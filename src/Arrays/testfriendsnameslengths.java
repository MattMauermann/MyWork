package Arrays;

import java.util.Scanner;

public class testfriendsnameslengths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] names = new String[20];
		int sum = 0;
		System.out.println("What are the names of 20 of your friends");
		for (int counter = 0; counter < 20; counter++) {
			names[counter] = input.nextLine();
		}
		System.out.println("What length of the names do you want to test?");
		int length = input.nextInt();
		for (int counter = 0; counter < 20; counter++) {
			if (names[counter].length() == length) {
				sum++;
			}
		}
		System.out.println("The number of your friends with that length of name is " + sum);
	}

}
