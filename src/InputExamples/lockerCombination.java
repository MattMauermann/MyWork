package InputExamples;
import java.util.Scanner;
public class lockerCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1= -999;
Scanner input = new Scanner(System.in);
System.out.println("What is your first number?");
num1 = input.nextInt();
int num2= -999;
System.out.println("What is your second number?");
num2 = input.nextInt();
int num3= -999;
System.out.println("What is your third number?");
num3 = input.nextInt();
System.out.println("Your locker combination is " + num1 + "-" + num2 + "-" + num3);
input.close();
	}

}
