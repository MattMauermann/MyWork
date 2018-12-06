package Stings;

public class essay {

	private String name;
	private String essay;
	int counter;
	int counterstart;
	int counterend;
	int length;

	public essay() {

	}

	public void setName(String bob) {
		name = bob;
	}

	public void setEssay(String essay2) {
		essay = essay2;
	}

	public String uppercase() {
		String first = name.substring(name.indexOf(' '), (name.length() - 1));
		first.toUpperCase();
		return first;

	}

	public int charinname() {

		String length = name.substring(0, name.indexOf(' '));
		return length.length();
	}

}
