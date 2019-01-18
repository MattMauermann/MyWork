package Arrays;

import java.util.Random;

public class trappingkids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();

		int[][] heights = new int[10][12];
		int min = 42;
		int max = 72;
		double totalsum = 0;
		int shortest = 80;
		int tallest = 0;
		for (int rows = 0; rows < 10; rows++) {
			for (int columns = 0; columns < 12; columns++) {
				int randomNum = min + generator.nextInt(max - min + 1);
				if (randomNum > tallest) {
					tallest = randomNum;
				}
				if (randomNum < shortest) {
					shortest = randomNum;
				}
				heights[rows][columns] = randomNum;

				totalsum = totalsum + randomNum;

			}
		}
		double average = totalsum / 120;
		System.out.println("The average height of the trapped children in inches was " + average + " inches");
		System.out.println(
				"The tallest child was " + tallest + " inches and the shortest child was " + shortest + " inches");

	}

}
