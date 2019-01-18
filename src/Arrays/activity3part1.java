package Arrays;

import java.util.Random;

public class activity3part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int[] students = new int[1340];
		int min = 1;
		int max = 17;
		double sum = 0;
		for (int houses = 0; houses < 1340; houses++) {
			students[houses] = min + generator.nextInt(max - min + 1);
			if (students[houses] % 2 == 0) {
				sum++;
			}
		}
		System.out.println("The number of households with an even number of students is " + sum);
		System.out.println("The percentage of houses with an even number of students is " + (sum / 1340) * 100);
	}
}
