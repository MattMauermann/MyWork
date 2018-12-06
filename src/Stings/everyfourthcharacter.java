package Stings;

import java.util.Scanner;

public class everyfourthcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("input a sentence");
		String sentence = input.nextLine();
		int length = sentence.length();
		length = length;
		int index = 0;
		while (index <= length) {
			System.out.println(sentence.charAt(index));
			index = index + 4;
		}
	}

}
