package ObjectOrientedProgramming;

public class worker {
private int hours;
private double pay;
public worker() {
	hours=-999;
	pay=-999;
}
public worker(int newhours, double newpay) {
	hours = newhours;
	pay= newpay;
}
public double getpay() {
	return pay;
}
public double gethours() {
	return hours;
}
public void tothours(int hoursworked) {
	hours=hoursworked;
}
public void setwage(double wages) {
	pay=wages;
}
public double payCheck() {
	double payCheck=hours*pay;
	return payCheck;
}

}
