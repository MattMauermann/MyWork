package MathOperators;
import java.util.Scanner;
public class yearsTillVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age= -999;
Scanner input= new Scanner(System.in);
System.out.println("How old are you right now?");
age = input.nextInt();
age = 18- age;
System.out.println("You will be able to vote in " + age + " years");
input.close();
	}

}
