package ObjectOrientedProgramming;

public class phone {
	private long phonenumber;
	private long speeddial;
	private long lastnumbercalled;
	final private long EMERGENCY = 911;
	private long calls;
	private long minutes;

	public phone() {

	}

	public phone(long xphone, long xspeed, long xlast, long xcalls, long xminutes) {
		phonenumber = xphone;
		speeddial = xspeed;
		lastnumbercalled = xlast;
		calls = xcalls;
		minutes = xminutes;
	}

	public void makecall(long xsent, long xintchange) {
		lastnumbercalled = xsent;
		minutes += xintchange;
		calls++;
	}

	public long getCalls() {
		return calls;
	}

	public long getMinutes() {
		return minutes;
	}
}
