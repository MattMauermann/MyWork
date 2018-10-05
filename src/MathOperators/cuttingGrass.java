package MathOperators;
import java.util.Scanner;
public class cuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
double width;
double length;
double radius;
double field;
double fountain;
System.out.println("What is the width of the lawn?");
width=input.nextDouble();
System.out.println("What is the length of the lawn?");
length=input.nextDouble();
System.out.println("What is the radius of the lawn fountain?");
radius=input.nextDouble();
field=length*width;
fountain=(radius*radius)*Math.PI;
field=field-fountain;
field=field/100;
field=field*1.25;
System.out.println(field + " dollars are owed for mowing this lawn!");
input.close();
	}

}
