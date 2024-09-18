package com.rgsoftware.java8tests.test05222024;

interface Service {
	String login(String username, String password);
}

public class LambdaEx3 {

	public static void main(String[] args) {
		Service s = (username, password) -> {
			return username.equalsIgnoreCase("your") && password.equals("mine") ? "login sucesss" : "login faild";
		};
		System.out.println(s.login("your", "mine"));

	}

}
 