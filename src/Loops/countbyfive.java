package Loops;

import java.util.Scanner;

public class countbyfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int user = 0;
		int count = 0;
		System.out.println("What is the number that you want to count to?");
		user = input.nextInt();
		while (count <= user) {
			System.out.println(count);
			count = count + 5;

		}
	}

}
