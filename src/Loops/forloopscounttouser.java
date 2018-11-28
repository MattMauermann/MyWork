package Loops;

import java.util.Scanner;

public class forloopscounttouser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many times do you want to display hello?");
		int user = input.nextInt();
		int counter = 0;
		for (counter = 1; counter <= user; counter++) {
			System.out.println(counter + " Hello");
		}
	}

}
