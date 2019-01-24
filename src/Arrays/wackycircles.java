package Arrays;

import java.util.Random;

public class wackycircles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int min = 0;
		int max = 10;
		double sum = 0;
		String[] radii = new String[10];
		for (int j = 0; j < 10; j++) {
			double randomNum = min + generator.nextInt(max - min + 1);
			double radius = randomNum;
			radius = (radius * radius) * Math.PI;
			sum = sum + radius;
		}
		System.out.println(sum);

	}

}
