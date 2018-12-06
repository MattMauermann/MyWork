package Stings;

import java.util.Random;
import java.util.Scanner;

public class generatepassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("enter 3 words");
		String sentence = input.nextLine();
		char p1 = sentence.charAt(0);
		System.out.println(p1);
		int counterstart = 0;
		int counterend = 0;
		int j = 0;
		int length = sentence.length();
		char randomNum;
		for (int counter = 0; counter < length; counter++) {
			if (sentence.charAt(counter) == ' ' || sentence.charAt(counter) == '.') {
				counterend = counter;
				while (j < 1) {
					char p2 = sentence.charAt(counterend + 2);
					System.out.println(p2);
					j++;
				}

				counterstart = counter;
				while (j == 1) {
					int min = counterstart;
					int max = length;
					char p3 = sentence.charAt(min + generator.nextInt(max - min + 1));
					System.out.println(p3);
					j++;
				}

			}
			//
			// System.out.println(sentence.charAt(min + generator.nextInt(max - min + 1)));
		}
	}
//int min = counterstart;
	// int max = length;
	// int stupidv2 = 0;
	// if (stupidv2 < 1) {
	// System.out.println(sentence.charAt(min + generator.nextInt(max - min + 1)));
	// stupidv2++;
//int max;
//int min;

//int randomNum = min + generator.nextInt(max - min + 1);

}
