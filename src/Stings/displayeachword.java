package Stings;

import java.util.Scanner;

public class displayeachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a sentence ending with a period");
		String sentence = input.nextLine();
		int length = sentence.length();
		int counterstart = 0;
		int counterend = 0;
		int words = 0;
		for (int counter = 0; counter < length; counter++) {
			if (sentence.charAt(counter) == ' ' || sentence.charAt(counter) == '.') {
				counterend = counter;
				System.out.println(sentence.substring(counterstart, counterend));
				words++;
				counterstart = counter;
			}

		}
		System.out.println("there were " + words + " words");
	}

}
