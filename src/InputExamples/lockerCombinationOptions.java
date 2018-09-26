package InputExamples;
import java.util.Scanner;
public class lockerCombinationOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1= -999;
Scanner input = new Scanner(System.in);
System.out.println("What is the first number of your combination?");
num1 = input.nextInt();
int num2= -999;
System.out.println("What is the second number of your combination?");
num2= input.nextInt();
int num3= -999;
System.out.println("What is the third number of your combination?");
num3= input.nextInt();
System.out.println("Your first option is " + num1 + "-" + num2 + "-" + num3);
System.out.println("Your second option is " + num1 + "-" + num3 + "-" + num2);
System.out.println("Your third option is " + num2 + "-" + num1 + "-" + num3);
System.out.println("Your fourth option is " + num2 + "-" + num3 + "-" + num1);
System.out.println("Your fifth option is " + num3 + "-" + num1 + "-" + num2);
System.out.println("Your sixth option is " + num3 + "-" + num2 + "-" + num1);
input.close();
	}

}
