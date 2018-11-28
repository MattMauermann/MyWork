package Loops;

public class displaysequencesofnumbersnestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int counter2 = 0;
		int multiplier = 0;
		for (counter = 1; counter <= 1; counter++) {
			for (counter2 = 1; counter2 <= 1; counter2++) {
				System.out.println(counter * counter2 + "-" + counter * (2 * counter2) + "-" + counter * (3 * counter2)
						+ "-" + counter * (4 * counter2) + "-" + counter * (5 * counter2) + "-" + counter);
			}
		}

		for (counter = 1; counter <= 1; counter++) {
			for (counter2 = 1; counter2 <= 1; counter2++) {
				System.out.println(counter * (2 * counter2) + "-" + counter * (3 * counter2) + "-"
						+ counter * (4 * counter2) + "-" + counter * (5 * counter2) + "-" + counter * (2 * counter2));
			}

		}
		for (counter = 1; counter <= 1; counter++) {
			for (counter2 = 1; counter2 <= 1; counter2++) {
				System.out.println(counter * (3 * counter2) + "-" + counter * (4 * counter2) + "-"
						+ counter * (5 * counter2) + "-" + counter * (3 * counter2));
			}

		}
		for (counter = 1; counter <= 1; counter++) {
			for (counter2 = 1; counter2 <= 1; counter2++) {
				System.out.println(
						counter * (4 * counter2) + "-" + counter * (5 * counter2) + "-" + counter * (4 * counter2));
			}

		}
		for (counter = 1; counter <= 1; counter++) {
			for (counter2 = 1; counter2 <= 1; counter2++) {
				System.out.println(counter * (5 * counter2) + "-" + counter * (5 * counter2));
			}

		}
	}
}
