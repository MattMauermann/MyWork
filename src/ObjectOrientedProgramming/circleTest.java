package ObjectOrientedProgramming;

public class circleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
circle bob=new circle();
//using the alternator constructor, circle bob=new circle(4.5);
bob.setRadius(2);
System.out.println(bob.getRadius());
System.out.println(bob.circumference());
System.out.println(bob.area());

bob=new circle(4.78);
System.out.println(bob.getRadius());
System.out.println(bob.circumference());
System.out.println(bob.area());
	
	}
}
