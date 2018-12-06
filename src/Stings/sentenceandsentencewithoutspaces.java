package Stings;

import java.util.Scanner;

public class sentenceandsentencewithoutspaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("input a sentence");
		String sentence = input.nextLine();
		for (int counter = 0; counter < sentence.length(); counter++) {
			if (sentence.charAt(counter) != 'a' && sentence.charAt(counter) != ' ') {
				System.out.print(sentence.charAt(counter));
			}

		}
		System.out.println();
		System.out.println(sentence);

	}

}
