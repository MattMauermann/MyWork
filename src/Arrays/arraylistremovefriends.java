package Arrays;

import java.util.ArrayList;

public class arraylistremovefriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> buddies = new ArrayList<String>();
		buddies.add("tony");
		buddies.add("trony");
		buddies.add("tosny");
		buddies.add("tfony");
		buddies.add("tovny");
		buddies.add("tsony");
		buddies.add("tohny");
		buddies.add("thony");
		buddies.add("tjuony");
		buddies.add("terony");
		buddies.remove(0);
		buddies.remove(buddies.size() - 1);
		for (int j = 0; j < buddies.size(); j++) {
			System.out.println(buddies.get(j));
		}
	}

}
