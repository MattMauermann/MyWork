package ObjectOrientedProgramming;

import java.util.Scanner;

public class sandboxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fillSandbox bob=new fillSandbox();
bob.fill1();


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
bob.fill2(volume, rate);



System.out.println("What is the length of the box?");
double length1=input.nextDouble();
System.out.println("What is the width of the box?");
double width1=input.nextDouble();
System.out.println("what is the depth of the box?");
double depth1=input.nextDouble();
System.out.println("What is the rate at which transported in cubic feet/hour?");
double rate1= input.nextDouble();
double volume1=width1*length1*depth1;
bob.fill3(volume1, rate1);
System.out.println("It will take " + time + "hours to fill the sandbox of volume " + volume + "cubic feet");


	}

}
