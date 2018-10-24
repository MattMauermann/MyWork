package ObjectOrientedProgramming;

public class newcar {
	private double mpg;
	private double capacity;
	private double fuel;
	private double odometer;

	public newcar() {
		mpg = 20;
		capacity = 20;
		fuel = 20;
		odometer = 0;

	}

	public newcar(double xmpg, double xcapacity, double xfuel, double xodometer) {
		mpg = xmpg;
		capacity = xcapacity;
		fuel = xfuel;
		odometer = xodometer;
	}

	public void fill() {
		double gallonsused = capacity - fuel;
		fuel = capacity;
	}

	public void drive(double xmiles) {
		double milesdriven = xmiles;
		odometer += xmiles;
	}

	public double getfuel() {
		return fuel;
	}

	public double getodo() {
		return odometer;
	}
}
