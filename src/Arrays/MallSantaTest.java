package Arrays;

import java.util.Scanner;

public class MallSantaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("please enter the information of 100000 santas");
		String[] mallSanta = new String[100000];
		MallSanta bob = new MallSanta();
		for (int count = 0; count < 100000; count++) {
			System.out.println("What is the name of the santa?");
			String xname = input.nextLine();
			System.out.println("What is the age of the santa?");
			int xage = input.nextInt();
			System.out.println("Is this person a criminal?");
			boolean xcriminal = input.nextBoolean();
			boolean criminal = xcriminal;

			bob.employable();
			if (bob.employable() == true) {
				System.out.println(xname);
			}
		}
	}

	// Scanner input = new Scanner(System.in);
	// int numSantas = 2;
	// String name = "bob";
	// int age = 7;
	// boolean criminal = false;
	// MallSanta[] bob = new MallSanta[numSantas];

	// String[] names= new String[numSantas];

	// for (int i = 0; i < numSantas; i++) {

	// System.out.println("Please enter the santa name");
	// name = input.nextLine();
	// System.out.println("Please enter the age");
	// age = input.nextInt();
	// System.out.println("criminal?");
	// criminal = input.nextBoolean();

	// bob[i] = new MallSanta(name, criminal, age);
	// input.nextLine();
	// }
	// for (int j = 0; j < numSantas; j++) {
	// if (bob[j].employable() == true) {
	// System.out.println("The employable santas include: " + bob[j].getName());
}
