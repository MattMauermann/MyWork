package ObjectOrientedProgramming;

public class rectangletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rectangle bob=new rectangle();

bob.setlength(3);
bob.setwidth(4);
System.out.println(bob.getlength());
System.out.println(bob.getwidth());
System.out.println(bob.perimeter());
System.out.println(bob.area());

bob=new rectangle(3, 4);
System.out.println(bob.getlength());
System.out.println(bob.getwidth());
System.out.println(bob.perimeter());
System.out.println(bob.area());
	}

}
