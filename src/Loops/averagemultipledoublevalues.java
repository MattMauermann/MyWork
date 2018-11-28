package Loops;

import java.util.Scanner;

public class averagemultipledoublevalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num = 0;
		double sum = 0;
		int count = 0;
		System.out.println("Input your value or 0 to end the loop");
		num = input.nextDouble();
		while (num != 0) {
			sum += num;
			count++;
			System.out.println("input your value or 0 for termination");
			num = input.nextDouble();
		}
		double avg = sum / count;
		System.out.println("Your average is" + avg);
	}

}
