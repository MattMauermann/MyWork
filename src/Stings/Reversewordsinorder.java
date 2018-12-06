package Stings;

import java.util.Scanner;

public class Reversewordsinorder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a word");
		String word = input.nextLine();
		int length = word.length();
		char countstart;
		char countend;
		char first;
		char last;
		for (int count = 0; count < length; count++) {
			countstart = word.charAt(count);
			countend = word.charAt((length - 1) - count);
			last = countend;
			first = countstart;
			System.out.println(last + " " + first);
		}
	}
}