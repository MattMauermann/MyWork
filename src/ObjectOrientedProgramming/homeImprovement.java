package ObjectOrientedProgramming;

public class homeImprovement {

	public homeImprovement()
{
}
public void sayPaint(double num1, double num2)
{
	double timetopaint=(((num1*num2)/200)*60);
	System.out.println("It takes " + timetopaint +  " minutes to paint");
}
public void sayPlant (double num1)
{
	double timetoplant=((10*num1)/7.5);
	System.out.println("It will take " + timetoplant + " hours to plant");
}
public void sayPool (double num1, double num2)
{
	double timetofill=(((num1*num1)*num2)*Math.PI)/300;
	System.out.println("It will take " + timetofill + " hours to fill the pool");
}
}