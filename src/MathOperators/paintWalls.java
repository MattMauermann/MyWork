package MathOperators;
import java.util.Scanner;
public class paintWalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
double width=-999;
double length=-999;
double sa;
double paint;
System.out.println("What is the width of the room?");
width= input.nextDouble();
System.out.println("What is the length of the room");
length= input.nextDouble();
sa=((width*8)*2)+((length*8)*2);
paint=(int)Math.ceil(sa/150);
System.out.println("The demensions of the room are " + length + "x" + width + "x" + "8");
System.out.println("The area that needs to be covered is " + sa + " feet");
System.out.println("You need " + paint + "gallons of paint to cover the area");
input.close();
	}

}
