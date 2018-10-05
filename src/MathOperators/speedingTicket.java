package MathOperators;
import java.util.Scanner;
public class speedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
double speed=-999;
double speedlimit=-999;
double ticket=-999;
System.out.println("What is the speed limit?");
speedlimit= input.nextDouble();
System.out.println("What is your speed?");
speed= input.nextDouble();
ticket= speed-speedlimit;
ticket=ticket-1;
ticket=ticket*40;
ticket=ticket+55;
System.out.println("Your speed is " + speed);
System.out.println("The speed limit is " + speedlimit);
System.out.println("The price of your ticket is " + ticket);
	}

}
