package ObjectOrientedProgramming;

import java.util.Scanner;

public class catTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cat bob = new cat(8, 12);
		Scanner input = new Scanner(System.in);
		System.out.println(bob.getAge());
		bob.birthday();
		System.out.println(bob.getAge());
		System.out.println(bob.getSleep());
		bob.sleepmore(1);
		System.out.println(bob.getSleep());
		bob.sleepless(1);
		System.out.println(bob.getSleep());
		
	}

}
