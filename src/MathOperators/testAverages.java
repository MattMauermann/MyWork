package MathOperators;
import java.util.Scanner;
public class testAverages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
double test1=-999;
double test2=-999;
double test3=-999;
System.out.println("What is the first test score?");
test1= input.nextDouble();
System.out.println("What was the second test score?");
test2= input.nextDouble();
System.out.println("What was the third test score?");
test3= input.nextDouble();
System.out.println("The first test got a score of " + test1);
System.out.println("The second test got a score of " + test2);
System.out.println("The third test got a score of " + test3);
double average = -999;
average= (test1+test2+test3)/3;
System.out.println("The average of the three tests is " + average);
input.close();
	}

}
