package Stings;

import java.util.Scanner;

public class twoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("input a string");
		String sentence = input.nextLine();
		System.out.println("input another string");
		String sentence2 = input.nextLine();
		System.out.println(sentence.compareTo(sentence2));
	}

}
