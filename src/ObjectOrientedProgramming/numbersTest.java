package ObjectOrientedProgramming;

public class numbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Numbers bob=new Numbers();
bob.sayNumber(3);
bob.sayNumberPlus2(7);
bob.saySum(3, 6);
System.out.println("What is the length of the box?");

double box=bob.returnSquare(4);
System.out.println(box);


int returnArea=bob.returnArea(7, 8);
System.out.println(returnArea);

int Round=bob.returnRound(8.6);
System.out.println(Round);
	}

}
