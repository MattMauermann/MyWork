package Loops;

import java.util.Scanner;

public class sumofvaluesaddingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the number that you want to count to?");
		int countto = input.nextInt();
		int count = 0;
		int sum = 0;
		while (count <= countto) {
			sum += count;
			count = count + 2;
		}
		System.out.println("sum is: " + sum);
	}

}
