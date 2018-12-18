package Arrays;

import java.util.Scanner;

public class friendsnamesinreverseorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What are your friends names?");
		String[] names = new String[25];
		for (int counter = 0; counter < 25; counter++) {
			names[counter] = input.nextLine();
		}
		System.out.println("in reverse order");
		for (int counter = 24; counter >= 0; counter--) {
			System.out.println(names[counter]);
		}
	}

}
