package ObjectOrientedProgramming;

public class cat {
	private int age;
	private int sleep;

	public cat() {
		age = 0;
		sleep = 0;
	}

	public cat(int xAge, int xSleep) {
		age = xAge;
		sleep = xSleep;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int xAge) {
		age=xAge;
	}

	public int getSleep() {
		return sleep;
	}

	public void setSleep(int xSleep) {
		sleep=xSleep;
	}

	public void birthday() {
		age = age +1;

	}

	public void sleepmore(int add) {
		sleep = sleep + add;
	}

	public void sleepless(int add) {
		sleep = sleep- add ;
	}
}
