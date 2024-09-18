package com.rgsoftware.java8tests.test05222024;

interface VoterCheck {
	String voter(String name, String age, String location);
}

public class LambdaEx4 {

	public static void main(String[] args) {
		VoterCheck s = (name, age, location) -> {
			return name.equalsIgnoreCase("ravi") && age.equals("18") || location.equals("buguda") ? "eligible for voter"
					: "not ilegible for voter";
		};
		String status = s.voter("Ravi", "56", "buguda");
		System.out.println(status);
	}

}
