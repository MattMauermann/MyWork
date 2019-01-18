package Arrays;

import java.util.ArrayList;

public class arraylistsfriendset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> friends = new ArrayList<String>();
		friends.add("bob smith");
		friends.add("jane Miller");
		friends.add("Billy Jones");
		String thing = friends.remove(0);
		friends.add(1, thing);
		String thang = friends.remove(friends.size() - 1);
		friends.add(0, thang);

		for (int i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i));
		}
	}
}
