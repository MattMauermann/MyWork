package MathOperators;
import java.util.Scanner;
public class Age7YearsInFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age =-999;
Scanner input= new Scanner(System.in);
System.out.println("How old are you right now?" );
age = input.nextInt();
age = age + 7;
System.out.println("In 7 years, you will be " + age + "years old");
input.close();
	}

}
