package Loops;

public class nestedloopsdisplayarrayofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int counter2 = 0;
		int multiplier = 0;
		for (counter = 1; counter <= 4; counter++) {
			for (counter2 = 1; counter2 <= 5; counter2++) {
				System.out.println(counter * counter2 + "-" + counter * multiplier);
			}
		}
	}

}
