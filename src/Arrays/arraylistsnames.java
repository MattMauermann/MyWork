package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistsnames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> friends = new ArrayList<String>();
		friends.add("bob smith");
		friends.add("jane Miller");
		friends.add(0, "Billy Jones");
		System.out.println("What is your name?");
		String name = input.nextLine();
		friends.add(name);
		friends.remove(1);
		for (int i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i));
		}
	}

}
