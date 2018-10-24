package ObjectOrientedProgramming;

import java.util.Scanner;

public class phoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone bob = new phone();
		Scanner input = new Scanner(System.in);
		System.out.println("What was the number that you called and how long was the call");
		long xsent = input.nextLong();
		long xintchange = input.nextLong();
		bob.makecall(xsent, xintchange);

		System.out.println("you have made " + bob.getCalls() + "calls and have used " + bob.getMinutes() + " minutes ");

		System.out.println("What was the number that you called and how long was the call");
		long xsent2 = input.nextLong();
		long xintchange2 = input.nextLong();
		bob.makecall(xsent, xintchange);

		System.out.println("you have made " + bob.getCalls() + "calls and have used " + bob.getMinutes() + " minutes ");

		input.close();
	}

}
