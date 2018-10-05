package MathOperators;
import java.util.Scanner;
public class dividendDivider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
int dividend= -999;
System.out.println("What is the dividend?");
dividend=input.nextInt();
int remainder=-999;
int divisor=-999;
System.out.println("What is the divisor?");
divisor=input.nextInt();
dividend= dividend/divisor;
remainder= dividend%divisor;
System.out.println("The answer is " + dividend + "r" + remainder);
input.close();
	}

}
