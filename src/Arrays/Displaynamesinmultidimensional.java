package Arrays;

import java.util.Scanner;

public class Displaynamesinmultidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[][] names = new String[4][3];
		for (int rows = 0; rows < 4; rows++) {
			for (int columns = 0; columns < 3; columns++) {
				System.out.println("What is the name that you want to store?");
				names[rows][columns] = input.nextLine();
			}
			System.out.println();
		}
		System.out.println("Here are the names");
		for (int row = 0; row < 4; row++) {
			// finish here. picture has been acquired
		}
	}

}
