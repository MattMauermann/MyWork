package Loops;

import java.util.Scanner;

public class cashRegistertaxforloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int numitems = 0;
		double sum = 0;
		double tax;
		double singleprice;
		System.out.println("How many items are you purchasing?");
		numitems = input.nextInt();
		for (counter = numitems; counter > 0; counter = counter - 1) {
			System.out.println("What is the price of the item?");
			singleprice = input.nextDouble();
			sum = sum + singleprice;
		}
		System.out.println("These items cost " + sum);
		sum = sum * 0.05;
		System.out.println("The tax on these items is " + sum);
		sum = sum * 21;
		System.out.println("The cost after tax for these items is " + sum);
	}

}
