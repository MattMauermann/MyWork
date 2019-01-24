package Arrays;

import java.util.Scanner;

public class multidimensionalarrayslength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("number of rows");
		int maxrow = input.nextInt();
		System.out.println("number of columns");
		int maxcol = input.nextInt();

		double[][] tests = new double[maxrow][maxcol];
		for (int row = 0; row < tests.length; row++) {
			for (int column = 0; column < tests[0].length; column++) {
				// do something
			}
		}
	}

}
