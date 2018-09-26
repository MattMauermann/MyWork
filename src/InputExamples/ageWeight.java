package InputExamples;
import java.util.Scanner;
public class ageWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age= -999;
Scanner input = new Scanner(System.in);
System.out.println("What is your age?");
age = input.nextInt();
int weight= -999;
System.out.println("How much do you weigh?");
weight = input.nextInt();
System.out.println("You weigh" + weight + "pounds and you are " + age + "Years old");
input.close();
	}

}
