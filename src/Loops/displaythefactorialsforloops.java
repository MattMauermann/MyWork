package Loops;

import java.util.Scanner;

public class displaythefactorialsforloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int factorialinput;
		int sum = 1;
		int counter;
		System.out.println("What is the number that you want to take the factorial of");
		factorialinput = input.nextInt();
		for (counter = factorialinput; counter > 0; counter = counter - 1) {
			sum = sum * counter;
		}
		System.out.println("The factorial of this number is " + sum);
	}

}
