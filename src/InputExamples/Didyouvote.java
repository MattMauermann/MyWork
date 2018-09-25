package InputExamples;
import java.util.Scanner;
public class Didyouvote {
	public static void main(String[] args) {
boolean vote= false;
Scanner input = new Scanner(System.in);
System.out.println("Did You Vote?");
vote = input.nextBoolean();
System.out.println(vote + " you voted");
	}
}
