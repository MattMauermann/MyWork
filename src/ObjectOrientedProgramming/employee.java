package ObjectOrientedProgramming;

public class employee {
	private double wage;
	private int Experience;
	public employee()
	{
		wage=-999;
		Experience=1;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double xWage)
	{
	wage=xWage;	
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int xExperience)
	{
		Experience=xExperience;
	}
	public void raiseWage()
	{
		wage=wage*1.1;
	}
}
