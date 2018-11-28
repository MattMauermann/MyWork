package Loops;

import java.util.Scanner;

public class circlesandperimeterstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Circlesandperimeters bob = new Circlesandperimeters();
		double perimeter = 0;
		System.out.println("enter the value of 3 radiuses or input 999 as the first number to quit");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		do {
			if (num1 > num2 && num1 > num3) {
				bob.setRadius(num1);
				System.out.println("The perimeter of the largest circle is " + bob.circumference());
			}
			if (num2 > num1 && num2 > num3) {
				bob.setRadius(num2);
				System.out.println("The perimeter of the largest circle is " + bob.circumference());
			}
			if (num3 > num2 && num3 > num1) {
				bob.setRadius(num3);
				System.out.println("The perimeter of the largest circle is " + bob.circumference());
			}
			System.out.println("enter the value of 3 radiuses or input 999 as the first number to quit");
			num1 = input.nextInt();
			num2 = input.nextInt();
			num3 = input.nextInt();
		} while (num1 != 999);
	}
}
