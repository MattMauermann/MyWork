package Stings;

public class passwordmain {
	private String password;

	int exclamation = 0;
	int question = 0;
	int spaces = 0;

	public passwordmain() {
		password = "1aaaaa!";
	}

	public void setpassword(String xpassword) {
		if (xpassword.charAt(0) == '0' || xpassword.charAt(0) == '1' || xpassword.charAt(0) == '2'
				|| xpassword.charAt(0) == '3' || xpassword.charAt(0) == '4' || xpassword.charAt(0) == '5'
				|| xpassword.charAt(0) == '6' || xpassword.charAt(0) == '7' || xpassword.charAt(0) == '8'
				|| xpassword.charAt(0) == '9')
			;
		for (int count = 0; count < xpassword.length(); count++) {
			if (xpassword.charAt(count) == '!') {
				exclamation++;
			}
			if (xpassword.charAt(count) == '?') {
				question++;
			}
			if (xpassword.charAt(count) == ' ') {
				spaces++;
			}

		}
		if (spaces < 1 && question >= 1 && exclamation >= 1) {
			if (xpassword.length() < 22 && xpassword.length() > 7) {
				password = xpassword;
				boolean setpassword = true;
			}
		}
	}

	public boolean match(String xpassword) {
		boolean match = false;
		if (xpassword.compareTo(password) == '0') {
			match = true;
			return match;
		} else {
			return match;
		}
	}

}
