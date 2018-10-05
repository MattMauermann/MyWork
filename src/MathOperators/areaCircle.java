package MathOperators;
import java.util.Scanner;
public class areaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
double radius= -999.0;
System.out.println("What is the radius of the circle?");
radius= input.nextDouble();
double area= -999;
area= radius*radius*Math.PI;
System.out.println("The area of that circle is " + area);
	}

}
