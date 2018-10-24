package ObjectOrientedProgramming;

public class employeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee bob=new employee();
		bob.setWage(80);
		System.out.println(bob.getWage());
		bob.setExperience(8);
		System.out.println(bob.getExperience());
		double wage=bob.getWage();
		System.out.println(wage);
		bob.raiseWage();
		System.out.println(bob.getWage());
	}

}
