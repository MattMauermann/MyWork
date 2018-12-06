package Stings;

import java.util.Scanner;

public class vowelcountandconsonantcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = input.nextLine();
		int consonant = 0;
		int vowels = 0;
		int punctuation = 0;
		for (int counter = 0; counter < sentence.length(); counter++) {
			if (sentence.charAt(counter) != 'a' && sentence.charAt(counter) != ' ' && sentence.charAt(counter) != 'e'
					&& sentence.charAt(counter) != 'i' && sentence.charAt(counter) != 'o'
					&& sentence.charAt(counter) != 'u' && sentence.charAt(counter) != 'y'
					&& sentence.charAt(counter) != ',' && sentence.charAt(counter) != '.'
					&& sentence.charAt(counter) != '?' && sentence.charAt(counter) != '!') {
				consonant++;
			}
			if (sentence.charAt(counter) == 'a' || sentence.charAt(counter) == 'e' || sentence.charAt(counter) == 'i'
					|| sentence.charAt(counter) == 'o' || sentence.charAt(counter) == 'u'
					|| sentence.charAt(counter) == 'y' || sentence.charAt(counter) == 'I') {
				vowels++;
			}
			if (sentence.charAt(counter) == '?' || sentence.charAt(counter) == '!' || sentence.charAt(counter) == '.'
					|| sentence.charAt(counter) == ',') {
				punctuation++;
			}
		}
		System.out.println(consonant);
		System.out.println(vowels);
		System.out.println(punctuation);

	}

}
