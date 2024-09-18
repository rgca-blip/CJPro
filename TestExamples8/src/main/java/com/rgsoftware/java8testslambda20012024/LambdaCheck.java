package com.rgsoftware.java8testslambda20012024;

interface Service {

	// void wish();

	// void add(int number1, int number2);

	// String login(String username, String password);

	String voterCheck(String name, int age, String location);
}

public class LambdaCheck {
	public static void main(String[] args) {
		// wish message

		/*
		 * Service wishService = () -> System.out.println("good morning"); Service
		 * wishService1 = () -> { System.out.println("good morning");
		 * System.out.println("good morning"); }; wishService.wish();
		 */

		// math operation

		/*
		 * Service mathService = (number1, number2) ->
		 * System.out.println("your addition is : " + (number1 + number2));
		 * mathService.add(5, 5);
		 */

		// login operation

		/*
		 * Service loginService = (username, password) -> { return
		 * username.equalsIgnoreCase("manda") && password.equals("mahala") ? "login" :
		 * "login fail"; }; String status1 = loginService.login("manda", "mahalla");
		 * System.out.println("Your Login status...." + status1);
		 */

		/*
		 * Service checkService = (username, password) ->
		 * username.equalsIgnoreCase("ram") && password.equals("sita") ? "login" :
		 * "login fail"; String status2 = checkService.login("raM", "sita");
		 * System.out.println("Your login status..." + status2);
		 */

		// voter Check
		Service voterService = (name, age, location) -> {
			return name.equalsIgnoreCase("raghu") && age >= 18 == location.equals("manitara") ? "eligible for voter"
					: "not eligible for voter";
		};
		String eligible = voterService.voterCheck("raGhu", 18, "manitara");
		System.out.println("you are " + eligible);
	}
}