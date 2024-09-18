package com.rgsoftware.java8tests.test05232024;

interface ExampleOfLambda {
	String lambdaExample(String name, String age, String location);
}

public class LambdaEx6 {

	public static void main(String[] args) {
		ExampleOfLambda str = (name, age, location) -> {
			return name.equalsIgnoreCase("rakesh") && age.equals("18") || location.equals("solurpeta")
					? "eligible for voter"
					: "noe ilegeble for voter";
		};
		String s = str.lambdaExample("Rakesh", "18", "solurpeta");
		System.out.println(s);
	}

}
