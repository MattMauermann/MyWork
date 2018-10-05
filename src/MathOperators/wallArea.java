package MathOperators;
import java.util.Scanner;
public class wallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
int height= -999;
System.out.println("What is the width of the wall?");
height= input.nextInt();
int area= -999;
area= height*8;
System.out.println("the area of the wall is " + area);
input.close();
	}

}
