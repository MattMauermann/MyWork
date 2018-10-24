package ObjectOrientedProgramming;

import java.util.Scanner;

public class triangletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle bob = new triangle(5, 12);

		Scanner input = new Scanner(System.in);
		System.out.println(bob.hypot());
		System.out.println(bob.perimeter());
		System.out.println(bob.area());
	}

}
