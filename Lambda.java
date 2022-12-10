package userValidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Validator {
	public String validateUser(String input);
}

public class Lambda {

	public static void main(String[] args) throws IOException {
		System.out.println("WELCOME TO USER REGISTRATION VALIDATION PROGRAM");
		
		
		Validator firstName, lastName, email, mobile, password;

		firstName = (input) -> {
			String regex = "^[.A-Z]([a-z]+){2,}$"; // first letter cap and min 3 letters
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			if (matcher.matches()) {
				return "happy";
			} else {
				return "sad";
			}
		};

		lastName = (input) -> {
			String regex = "^[.A-Z]([a-z]+){2,}$"; // first letter cap and min 3 letters
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			if (matcher.matches()) {
				return "happy";
			} else {
				return "sad";
			}
		};

		email = (input) -> {
			String mailRegex = "^[a-zA-Z0-9+_.-]+(@)[^.][0-9a-z]*([.])[a-z.]+$";
			Pattern pattern = Pattern.compile(mailRegex);
			Matcher mailMatch = pattern.matcher(input);
			if (mailMatch.matches()) {
				System.out.println("Email is valid");
				return "happy";
			} else {
				System.out.println("Email is invalid");
				return "sad";
			}
		};

		mobile = (input) -> {
			String phoneRegex = "^(91)\\s[6-9]{1}[0-9]{9}$";
			Pattern pattern = Pattern.compile(phoneRegex);
			Matcher phoneMatch = pattern.matcher(input);
			if (phoneMatch.matches()) {
				return "happy";
			} else {
				return "sad";
			}
		};

		password = (input) -> {
			String passRegex = "(?=.*[A-Z])(?=.*[0-9])(?=[^@#^$&]*[@#^$&][^@#$^&]*$).{8,}";
			Pattern pattern = Pattern.compile(passRegex);
			Matcher passMatch = pattern.matcher(input);
			if (passMatch.matches()) {
				return "happy";
			} else {
				return "sad";
			}
		};

		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		while (loop) {
			System.out.println(
					"1.First Name \n2.LastName \n3.Email \n4.Phone Number "
							+ "\n5.Password Validation \n6.Exit");
			System.out.println("Enter an option");
			byte input = sc.nextByte();

			switch (input) {
			case 1:
				System.out.println("Enter first Name");
				String firstNameInput = sc.next();
				System.out.println(firstName.validateUser(firstNameInput));
				break;

			case 2:
				String lastNameInput = sc.next();
				System.out.println(lastName.validateUser(lastNameInput));
				break;

			case 3:
				String emailInput = sc.next();
				System.out.println(email.validateUser(emailInput));
				break;

			case 4:
				System.out.println("Format : (91_10digit mobile number)");
				BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
				String mobileNumberInput = read.readLine();
				System.out.println(mobile.validateUser(mobileNumberInput));
				break;

			case 5:
				System.out.println(" Enter the password ");
				String passwordInput = sc.next();
				System.out.println(password.validateUser(passwordInput));
				break;

			case 6:
				System.out.println("Terminated");
				loop = false;
				break;
			}
		}
		sc.close();
		
	}

}
