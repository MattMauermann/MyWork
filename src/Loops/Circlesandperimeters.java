package Loops;

public class Circlesandperimeters {

	private double radius;

	public double circumference() {
		double circumference = 2 * radius * Math.PI;
		return circumference;
	}

	public void setRadius(double xRadius) {
		radius = xRadius;
	}
}
