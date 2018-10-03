package MathOperators;
import java.util.Scanner;
public class phoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
int phonenumber;
int areacode;
int middlethree;
int lastfour;
System.out.println("What is your phone number?");
phonenumber=input.nextInt();
areacode=(int)phonenumber/10000000;
System.out.println("Your area code is " + areacode);
middlethree=(int)phonenumber/100;
middlethree=(int)middlethree/100;
middlethree=middlethree%1000;
System.out.println("Your middle digits are " + middlethree);
lastfour=(int)phonenumber/1;
lastfour=(int)lastfour%10000;
System.out.println("Your last four digits are " + lastfour);
input.close();
	}

}
