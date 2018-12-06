package Stings;

import java.util.Scanner;

public class guidancecounselor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("input the last names of students start with a space");
		String sentence = input.nextLine();
		int counter = 0;
		int counterend = 0;
		int counterstart = 0;
		int length = sentence.length();
		for (counter = 0; counter < length; counter++) {
			if (sentence.charAt(counter) == ' ') {
				counterend = counter;
				// System.out.println(sentence.substring(counterstart, counterend));
				if (sentence.charAt(counterend + 1) == 'a' || sentence.charAt(counterend + 1) == 'b'
						|| sentence.charAt(counterend + 1) == 'c' || sentence.charAt(counterend + 1) == 'd'
						|| sentence.charAt(counterend + 1) == 'e' || sentence.charAt(counterend + 1) == 'f'
						|| sentence.charAt(counterend + 1) == 'g') {
					System.out.println(" the guidance councelor is mr williams");
					// System.out.println(sentence.substring(counterstart, counterend));
				}
				if (sentence.charAt(counterend + 1) == 'h' || sentence.charAt(counterend + 1) == 'i'
						|| sentence.charAt(counterend + 1) == 'j' || sentence.charAt(counterend + 1) == 'k'
						|| sentence.charAt(counterend + 1) == 'l' || sentence.charAt(counterend + 1) == 'm'
						|| sentence.charAt(counterend + 1) == 'n') {
					System.out.println("The guidance counselor is Mrs Smith");
					// System.out.println(sentence.substring(counterstart, counterend));
				}
				if (sentence.charAt(counterend + 1) == 'o' || sentence.charAt(counterend + 1) == 'p'
						|| sentence.charAt(counterend + 1) == 'q' || sentence.charAt(counterend + 1) == 'r'
						|| (sentence.charAt(counterend + 1) == 's' && (sentence.charAt(counterend + 2) == 'a'
								|| sentence.charAt(counterend + 2) == 'b' || sentence.charAt(counterend + 2) == 'c'
								|| sentence.charAt(counterend + 2) == 'd' || sentence.charAt(counterend + 2) == 'e'
								|| sentence.charAt(counterend + 2) == 'f' || sentence.charAt(counterend + 2) == 'g'
								|| sentence.charAt(counterend + 2) == 'h' || sentence.charAt(counterend + 2) == 'i'
								|| sentence.charAt(counterend + 2) == 'j' || sentence.charAt(counterend + 2) == 'k'
								|| sentence.charAt(counterend + 2) == 'l' || sentence.charAt(counterend + 2) == 'm'
								|| sentence.charAt(counterend + 2) == 'n' || sentence.charAt(counterend + 2) == 'o'
								|| sentence.charAt(counterend + 2) == 'p' || sentence.charAt(counterend + 2) == 'q'
								|| sentence.charAt(counterend + 2) == 'r' || sentence.charAt(counterend + 2) == 's'
								|| sentence.charAt(counterend + 2) == 't'))) {
					System.out.println("The guidance counselor is Mrs Johnson");
					// System.out.println(sentence.substring(counterstart, counterend));
				}
				if ((sentence.charAt(counterend + 1) == 's'
						&& (sentence.charAt(counterend + 2) == 'u' || sentence.charAt(counterend + 2) == 'v'
								|| sentence.charAt(counterend + 2) == 'w' || sentence.charAt(counterend + 1) == 'x'
								|| sentence.charAt(counterend + 1) == 'y' || sentence.charAt(counterend + 1) == 'z'))
						|| sentence.charAt(counterend + 1) == 't' || sentence.charAt(counterend + 1) == 'u'
						|| sentence.charAt(counterend + 1) == 'v' || sentence.charAt(counterend + 1) == 'w'
						|| sentence.charAt(counterend + 1) == 'x' || sentence.charAt(counterend + 1) == 'y'
						|| sentence.charAt(counterend + 1) == 'z') {
					System.out.println(" the guidance councelor is  Mr Bond");
					// System.out.println(sentence.substring(counterstart, counterend));

				}
				counterstart = counter;
			}
		}
	}

}
