package ObjectOrientedProgramming;

public class circle {
private double radius;
public circle() {
	radius=-999;
}
public circle(double newRadius) {
	radius=newRadius;
}

public double getRadius() {
	return radius;
}

public double circumference() {
	double circumference=2*radius*Math.PI;
	return circumference;
}
public double area() {
	double area=Math.PI*(radius*radius);
	return area;
}
public void setRadius(double xRadius) {
	radius=xRadius;
}
}