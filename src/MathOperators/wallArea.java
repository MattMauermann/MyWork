package MathOperators;
import java.util.Scanner;
public class wallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
int height= -999;
System.out.println("What is the height of the wall?");
height= input.nextInt();
height= height*height;
System.out.println("the area of the wall is " + height);
input.close();
	}

}
