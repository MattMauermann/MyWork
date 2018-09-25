package InputExamples;
import java.util.Scanner;
public class fortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age= -999;
Scanner input = new Scanner(System.in);
System.out.println("What is your age?");
age = input.nextInt();
int weight= -999;
System.out.println("How much do you weigh?");
weight = input.nextInt();
int luckynumber = -999;
System.out.println("What is your lucky number?");
luckynumber = input.nextInt();
System.out.println("In " + age + " years, you will be resident number " + weight + " at the old person home on " + luckynumber + " maple drive");
input.close();	
	}

}
