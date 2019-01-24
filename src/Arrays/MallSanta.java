package Arrays;

public class MallSanta {
	private String xname;
	private boolean xcriminal;
	private int xage;

	public void MallSanta() {

	}

	public void MallSanta(String name, boolean criminal, int age) {
		xname = name;
		xcriminal = criminal;
		xage = age;

	}

	public String getName() {
		return xname;
	}

	public boolean employable() {
		if (xage >= 50 && xage <= 70) {
			if (xcriminal == false) {
				return true;
			}

		}
		return false;
	}
}
