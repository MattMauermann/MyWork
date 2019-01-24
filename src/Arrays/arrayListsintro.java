package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListsintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		names.add("bob");
		names.add("jane");
		names.add("Billy");
		System.out.println("What is your name?");
		names.add(input.nextLine());
		for (int j = 0; j < names.size(); j++) {
			System.out.println(names.get(j));
		}
	}

}
