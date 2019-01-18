package Arrays;

import java.util.ArrayList;
import java.util.Random;

import ObjectOrientedProgramming.rectangle;

public class arraylistrectangleset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<rectangle> rectangle = new ArrayList<rectangle>();
		Random generator = new Random();
		int min = 50;
		int max = 70;
		for (int j = 0; j < 400; j++) {
			int width = min + generator.nextInt(max - min + 1);
			int length = min + generator.nextInt(max - min + 1);
			rectangle.add(new rectangle(width, length));
		}
		rectangle thing = rectangle.remove(rectangle.size() - 1);
		rectangle.set(0, thing);
		for (int i = 0; i < 400; i++) {
			System.out.println(rectangle.get(i).area());
		}

	}

}
