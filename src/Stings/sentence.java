package Stings;

import java.util.Scanner;

public class sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("input a sentence");
		String sentence = input.nextLine();
		System.out.println(sentence.charAt(0));
		System.out.println(sentence.charAt(2));
		System.out.println(sentence);
	}

}
