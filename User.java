package userValidation;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

	public boolean checkFirstName(String firstname) {
		String format = "^[A-Z]([a-z]+){2}$";
		Pattern pattern = Pattern.compile(format);
		Matcher firstnamematch = pattern.matcher(firstname);
		if (firstnamematch.matches()) {
			return (true);
		} else {
			return (false);
		}
	}

	public boolean checklastName(String lastname) {
		String format = "^[A-Z]([a-z]+){2}$";
		Pattern pattern = Pattern.compile(format);
		Matcher lastnamematch = pattern.matcher(lastname);
		if (lastnamematch.matches()) {
			return (true);
		} else {
			return (false);
		}
	}

	public boolean checkemail(String email) {
		String format = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.?-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(format);
		Matcher emailmatch = pattern.matcher(email);
		if (emailmatch.matches()) {
			return (true);
		} else {
			return (false);
		}
	}


	public boolean checkpassword(String password) {
		String format = "^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])(?=.*[a-z]).{8}$";
		Pattern pattern = Pattern.compile(format);
		Matcher passwordmatch = pattern.matcher(password);
		if (passwordmatch.matches()) {
			return (true);
		} else {
			return (false);
		}
	}

	public boolean checkmobileno(String mobile) {
		String format = "^[+](91)\\s[6-9][0-9]{9}$";
		Pattern pattern = Pattern.compile(format);
		Matcher mobilematch = pattern.matcher(mobile);
		if (mobilematch.matches()) {
			return (true);
		} else {
			return (false);

		}
	}

}
