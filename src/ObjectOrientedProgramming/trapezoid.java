package ObjectOrientedProgramming;

public class trapezoid {
	private double base1;
	private double base2;
	private double height;
	private double leg;

	public trapezoid() {

	}

	public trapezoid(double xbase1, double xbase2, double xheight, double xleg) {
		base1 = xbase1;
		base2 = xbase2;
		height = xheight;
		leg = xleg;

	}

	public double perimeter() {
		return base1 + base1 + leg + leg;
	}

	public double area() {
		return ((base1 + base2) / 2) * height;
	}
}
