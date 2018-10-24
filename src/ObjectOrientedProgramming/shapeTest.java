package ObjectOrientedProgramming;

import java.util.Scanner;

public class shapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle bob = new rectangle();
		circle bobby = new circle();
		triangle fred = new triangle();
		trapezoid freddy = new trapezoid();
		Scanner input = new Scanner(System.in);

		System.out.println("what is the length of your rectangle?");
		bob.setlength(input.nextDouble());
		bob.setwidth(input.nextDouble());
		System.out.println("area:" + bob.area() + "perimeter:" + bob.perimeter());

		System.out.println("What is the radius of your circle");
		bobby.changeradius(input.nextDouble());
		System.out.println("area:" + bobby.area() + "perimeter" + bobby.circumference());

		System.out.println("What is the base and the height of your triangle?");
		fred.changeheight(input.nextDouble());
		fred.changebase(input.nextDouble());
		System.out.println("Area:" + fred.area() + "perimeter:" + fred.perimeter());

	}

}
