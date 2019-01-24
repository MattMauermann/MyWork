package Arrays;

import java.util.ArrayList;
import java.util.Random;

import ObjectOrientedProgramming.rectangle;

public class arraylistsrectanglesordering {

	public static void main(String[] args) {
		ArrayList<rectangle> rectangleA = new ArrayList<rectangle>();
		// TODO Auto-generated method stub
		Random generator = new Random();
		int min = 0;
		int max = 50;
		int largest = 0;
		int smallest = 2500;
		for (int i = 0; i < 20; i++) {
			int randomNum = min + generator.nextInt(max - min + 1);
			int randomNum1 = min + generator.nextInt(max - min + 1);
			rectangleA.add(new rectangle(randomNum, randomNum1));
			if ((randomNum * randomNum1) > largest) {
				largest = i;
			}
			if ((randomNum * randomNum1) < smallest) {
				smallest = i;
			}

		}
		rectangle thing = rectangleA.remove(largest);
		rectangleA.add(0, thing);
		rectangle thang = rectangleA.remove(smallest);
		// rectangleA.add(rectangle.size()-1, thang);
	}

}
