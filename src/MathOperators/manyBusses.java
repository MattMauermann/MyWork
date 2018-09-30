package MathOperators;
import java.util.Scanner;
public class manyBusses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
int numberpeople=-999;
int numberbuses=-999;
int remainderpeople=-999;
System.out.println("How many people need to be moved?");
numberpeople= input.nextInt();
numberbuses=numberpeople/35;
remainderpeople= numberpeople%35;
System.out.println("The number of people that need to be bussed are " + numberpeople);
System.out.println("The number of buses that need to be rented is " + numberbuses);
System.out.println("The number of remaining people that need to be shuttled over is " + remainderpeople);
input.close();
	}

}
