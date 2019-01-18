package Arrays;

import java.util.Random;

public class randomrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		double sum = 0;
		double perimetersum = 0;
		for (int counter = 0; counter < 100; counter++) {
			rectangle bob = new rectangle();

			int min = 0;
			int max = 10;
			int width = min + generator.nextInt(max - min + 1);
			int length = min + generator.nextInt(max - min + 1);
			int area = width * length;
			sum += area;
			perimetersum = perimetersum + ((2 * width) + (2 * length));
		}
		System.out.println(sum + " is the sum of areas");
		System.out.println(perimetersum + " is the sum of the perimeters");
	}
}
