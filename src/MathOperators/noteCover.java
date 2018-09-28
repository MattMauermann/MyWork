package MathOperators;
import java.util.Scanner;
public class noteCover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
double width=-999;
double height=-999;
double area=-999;
System.out.println("What is the width of the rectangle?");
width=input.nextDouble();
System.out.println("What is the height of the rectangle?");
height=input.nextDouble();
area = height*width;
area=area/9;
System.out.println("It take " + area + " 3x3 post-it notes to cover the rectangle");
		
	}

}
