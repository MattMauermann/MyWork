package Loops;

public class findnumberwithmostdivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int num = 1000;
		int largest = 0;
		int largestnum = 0;
		for (int i = 0; num > 0; num--) {
			for (int j = num; j <= num && j > 0; j--) {
				if (num % j == 0) {
					count++;
					// gives the number of divisors for the number that was just tested.
				}
				if (count > largest) {
					largestnum = num;
					largest = count;
				}
			}
			count = 0;
		}
		System.out.println("There are " + largest + " divisors for this integer " + largestnum);

	}
}
