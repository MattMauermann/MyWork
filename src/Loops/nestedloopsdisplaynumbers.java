package Loops;

public class nestedloopsdisplaynumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int counter2 = 0;
		for (counter = 1; counter <= 1; counter++) {
			for (counter2 = 1; counter2 <= 4; counter2++) {
				System.out.println(counter + "     " + (counter + 1) + "       " + ((counter - 1) + counter2 * 1)
						+ "      " + (counter + 3) + "      " + (counter + 4));
			}
		}
	}

}
