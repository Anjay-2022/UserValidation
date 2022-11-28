package userValidation;

import java.util.Scanner;

import day19.User;

public class Main {

	public static void main(String[] args) {
		System.out.println("WELCOME TO USER REGISTRATION VALIDATION PROGRAM");
		User user = new User();
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println(
					"CHOOSE THE OPTION FOR VALIDATION OF: \n1.FIRST NAME\n2.EXIT");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				user.checkFirstName();
				break;
			
			case 2:
				run = false;
				break;
			default:
				System.out.println("choose correct option");
			}
		}

	}

}
