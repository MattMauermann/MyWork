package ObjectOrientedProgramming;

public class rectangle {
public double length;
public double width;
public rectangle() {
	length=-999;
	width=-999;
}
public rectangle(double newlength,double newwidth) {
	length=newlength;
	width=newwidth;
}
public double getlength() {
	return length;
}
public double getwidth() {
	return width;
}
public double perimeter() {
	double perimeter=(width+length)*2;
	return perimeter;
}
public double area() {
	double area=width*length;
	return area;
}
public void setlength(double xlength) {
	length=xlength;
}
public void setwidth(double xwidth) {
	width=xwidth;
}
}
