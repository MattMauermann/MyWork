package Loops;

import java.util.Random;

public class multipletrialsofflippingacoinalot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		double headscount = 0;
		double tailscount = 0;
		int flipcount = 0;
		int trialcount = 0;
		int min = 0;
		int max = 1;
		double highestheads = 0;
		double minimumtails = 100;
		double headspercent = 0;
		double tailspercent = 0;
		for (trialcount = 1; trialcount <= 100000; trialcount++) {
			for (flipcount = 1; flipcount <= 10000; flipcount++) {
				int randomNum = min + generator.nextInt(max - min + 1);
				if (randomNum == 0) {
					headscount++;
				}
				if (randomNum == 1) {
					tailscount++;
				}
				headspercent = ((headscount / 10000) * 100);
				tailspercent = ((tailscount / 10000) * 100);

			}
			headscount = 0;
			tailscount = 0;
			if (headspercent > highestheads) {
				highestheads = headspercent;
			}
			if (tailspercent < minimumtails) {
				minimumtails = tailspercent;
			}
		}
		System.out.println("the highest percent of heads was " + highestheads);
		System.out.println("the lowest percent of tails was " + minimumtails);
	}

}
