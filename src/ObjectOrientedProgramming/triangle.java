package ObjectOrientedProgramming;

public class triangle {
	private double base;
	private double height;

	public triangle() {
		base = 4;
		height = 5;
	}

	public triangle(double xbase, double xheight) {
		height = xheight;
		base = xbase;
	}

	public double hypot() {
		return Math.hypot(base, height);

	}

	public double perimeter() {
		return base + height + Math.hypot(base, height);
	}

	public double area() {
		return 0.5 * base * height;
	}

	public void changebase(double changeb) {
		base = changeb * base;
	}

	public void changeheight(double changeh) {
		height = changeh * height;
	}
}
