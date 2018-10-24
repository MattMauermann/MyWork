package ObjectOrientedProgramming;

import java.util.Scanner;

public class newcartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newcar kid = new newcar();
		newcar dad = new newcar();
		newcar mom = new newcar();
		Scanner input = new Scanner(System.in);

		dad.drive(9.53);
		mom.drive(0.4);
		mom.fill();
		kid.drive(15.87);
		dad.drive(1.56);
		dad.fill();

		System.out.println("Dad's car: " + dad.getfuel() + "gallons left" + dad.getodo() + "miles traveled");
		System.out.println("mom's car: " + mom.getfuel() + "gallons left" + mom.getodo() + "miles traveled");
		System.out.println(
				"kid's car: " + kid.getodo() / kid.getfuel() + "gallons left" + kid.getodo() + "miles traveled");

		input.close();
	}

}
