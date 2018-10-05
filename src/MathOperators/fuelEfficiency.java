package MathOperators;
import java.util.Scanner;
public class fuelEfficiency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
double distance=-999;
double mpg=-999;
double moneyspent=-999;
System.out.println("How far did you travel?");
distance=input.nextDouble();
System.out.println("What is the mpg of the car?");
mpg=input.nextDouble();
System.out.println("How much money did you spend on gas?");
moneyspent=input.nextDouble();
double gasused=-999;
double priceofgas=-999;
gasused=distance/mpg;
priceofgas=moneyspent/gasused;
System.out.println("You traveled " + distance + " miles");
System.out.println("You used " + gasused + " gallons of gas");
System.out.println("You spent " + moneyspent + " dollars on gas");
System.out.println("You spent " + priceofgas + " dollars per gallon of gas");
input.close();
//ask for distance of the trip, mpg of the car, and total amount of money spent
//display total distance traveled, how many gallone of gas was used, money spent on gas, and average cost per gallon
	}

}
