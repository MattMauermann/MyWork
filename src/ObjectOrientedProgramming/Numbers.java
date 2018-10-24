package ObjectOrientedProgramming;

public class Numbers {
	//instance fields
	
	//constructors
public Numbers()
{
}
public void sayNumber(int num)
{
	System.out.println("You sent " + num + " to the method");
}
public void sayNumberPlus2 (int num)
{
	System.out.println(num+2);
}
public void saySum(double num1, double num2)
{
	double result=num1 + num2;
	System.out.println(result);
}
public int returnSquare(int box)
{
	int answer=box*box;
	return answer;
}
public int returnArea(int length, int width)
{
	int result=length*width;
	return result;
}

public int returnRound(double value)
{
	int result= (int)Math.ceil(value);
			return result;
}
//methods
}
