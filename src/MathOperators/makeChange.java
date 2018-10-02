package MathOperators;
import java.util.Scanner;
public class makeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
double changein= -999;
System.out.println("How much money do you need change for?");
changein=input.nextDouble();
int dollars;
int quarters;
int dimes;
int nickels;
int pennies;
dollars= (int)Math.floor(changein);
changein= changein - dollars;
quarters=(int)Math.floor(changein/0.25);
changein=changein-0.25*quarters;
dimes=(int)Math.floor(changein/0.1);
changein=changein-0.1*dimes;
nickels=(int)Math.floor(changein/0.05);
changein=changein-0.05*nickels;
pennies=(int)Math.round(changein/0.01);
System.out.println("You get " + dollars + " dollars");
System.out.println("You get "+ quarters + " quarters");
System.out.println("You get " + dimes + " dimes");
System.out.println("You get " + nickels + " nickels");
System.out.println("You get " + pennies + " pennies");
input.close();
	}

}
