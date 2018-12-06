package Stings;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("input a single word");
		String word = input.nextLine();
		int length = word.length();
		int term = 0;
		int palindromedetector = 0;
		for (int counter = 0; counter < length; counter++) {
			if (word.charAt(counter) == word.charAt((length - 1) - counter)) {
				palindromedetector = palindromedetector;
			} else {
				palindromedetector++;
			}
		}
		if (palindromedetector < 1) {
			System.out.println("This is a palindrome");
		} else {
			System.out.println("This is not a palindrome");
		}
	}

}
