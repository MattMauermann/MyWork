package Loops;

import java.util.Scanner;

import ObjectOrientedProgramming.triangle;

public class ooptrianglesdowhiletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		triangle triangle1 = new triangle();
		triangle triangle2 = new triangle();
		int base;
		int height;
		do {
			System.out.println("What is the base and height of the first triangle enter 999 as the base to exit");

			base = input.nextInt();
			height = input.nextInt();
			triangle1.changebase(base);
			triangle1.changeheight(height);
			double area1 = triangle1.area();
			System.out.println("What is the base and height of the second triangle");
			base = input.nextInt();
			height = input.nextInt();
			triangle2.changebase(base);
			triangle2.changeheight(height);
			double area2 = triangle2.area();
			if (area1 > area2) {
				System.out.println("The first triangle is the largest and it's area is " + area1);
			} else {
				System.out.println("The second triangle is the largest and it's area is " + area2);
			}
		} while (base != 999);
	}

}
