package Stings;

import java.util.Scanner;

public class socialsecuritynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Give me your social security number");
		// no dashes in the social security number
		String ssn = input.nextLine();
		System.out.println(ssn.substring(5));
		System.out.println(ssn.substring(3, 5));
		System.out.println(ssn.substring(0, 3));
	}

}
