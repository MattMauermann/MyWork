package ObjectOrientedProgramming;

import java.util.Scanner;

public class fillSandbox {
	public fillSandbox()
	{
	}
	public void fill1()
	{
	Scanner input=new Scanner(System.in);
	System.out.println("What is the length of the box?");
	double length=input.nextDouble();
	System.out.println("What is the width of the box?");
	double width=input.nextDouble();
	System.out.println("what is the depth of the box?");
	double depth=input.nextDouble();
	System.out.println("What is the rate at which transported in cubic feet/hour?");
	double rate= input.nextDouble();
	double volume=width*length*depth;
	double time=volume/rate;
	System.out.println("It will take " + time + "hours to fill the sandbox of volume " + volume + "cubic feet");
	}
	public void fill2(double volume, double rate) {
		double time=volume/rate;
		System.out.println("It will take " + time + "hours to fill the sandbox of volume " + volume + "cubic feet");
	}
	public double fill3(double volume1, double rate1) {
		double time1=volume1/rate1; 
		return time1;
	}
	}
