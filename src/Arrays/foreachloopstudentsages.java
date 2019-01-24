package Arrays;

import java.util.Scanner;

public class foreachloopstudentsages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("How many students are in the class?");
		int[] students = new int[input.nextInt()];
		for (int j = 0; j < students.length; j++) {
			System.out.println("how old are the students?");
			students[j] = input.nextInt();

		}
		int sum = 0;
		for (int y : students) {
			sum += y;
		}
		System.out.println("average age " + ((double) sum / students.length));
	}

}