package Loops;

import java.util.Scanner;

public class zerotouserinputbytwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the number that you want to cout to?");
		int user = input.nextInt();
		int count = 0;
		while (count <= user) {
			System.out.println(count);
			count = count + 2;
		}

	}

}
