package Loops;

import java.util.Scanner;

public class forloopsdisplaysumofmultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the number that you want to use?");
		int countto = input.nextInt();
		int counter = 0;
		int sum = 0;
		for (counter = 1; counter <= 50; counter++) {
			sum = sum + (counter * countto);
		}
		System.out.println(sum);
	}

}
