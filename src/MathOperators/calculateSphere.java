package MathOperators;
import java.util.Scanner;
public class calculateSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
double radius=-999;
System.out.println("What is the radius of the sphere?");
radius= input.nextDouble();
radius= radius*radius*radius*Math.PI*1.33333333333333;
System.out.println("The volume of the sphere is " + radius);
input.close();
	}

}
