package com.rgsoftware.java8tests.test05232024;

interface LambdaExample7 {
	String lambdaFunction(String name, int i, String location);
}

public class LambdaEx7 {

	public static void main(String[] args) {
		LambdaExample7 obj = (name, d, location) -> {
			return name.equals("ram") && d < 18d || location.isBlank() ? "hi hello" : "bye bye";
		};
		String s = obj.lambdaFunction("ram", 18, "  b");
		System.out.println(s);
	}

}
