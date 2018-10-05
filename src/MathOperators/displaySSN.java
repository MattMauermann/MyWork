package MathOperators;
import java.util.Scanner;
public class displaySSN {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
int age;
int ssn;
int lastfourssn;
int until;
System.out.println("What is your age?");
age=input.nextInt();
System.out.println("What is you social security number?");
ssn=input.nextInt();
lastfourssn=ssn%10000;
until= 18-age;
System.out.println("You are " + age + " years old");
System.out.println("You will be 18 in " + until + " years");
System.out.println("Your social security number is " + ssn);
System.out.println("The last four digits of your social security number are " + lastfourssn);
input.close();
	}
}
