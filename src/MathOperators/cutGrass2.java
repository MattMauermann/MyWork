package MathOperators;
import java.util.Scanner;
public class cutGrass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
double length;
double width;
double area;
double widthblade;
double speed;
double mowerdamage;
double time;
double pay;
System.out.println("What is the width of the lawn?");
width= input.nextDouble();
System.out.println("What is the length of the lawn?");
length=input.nextDouble();
area=length*width;
System.out.println("What is the width of the mower deck in inches?");
widthblade=input.nextDouble();
widthblade=widthblade/12;
System.out.println("What is the speed of the mower in miles per hour");
speed=input.nextDouble();
speed=speed*5280;
speed=speed/3600;
//f/s
mowerdamage=widthblade*speed;
//f^2/s
time=area/mowerdamage;
time=time/60;
time=time/60;
//minutes. //hours
System.out.println("It will take " + time + " hours to mow this lawn");
pay=time*12;
System.out.println("The pay for cutting this lawn is " + pay + " dollars");
input.close();
	}

}
