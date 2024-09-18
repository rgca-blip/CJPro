package com.rgsoftware.java8tests.test05232024;

interface LambdaExampleforRakesh {
	String returnRakesh(String name, Integer age);
}

public class LambdaEx5 {

	public static void main(String[] args) {
		LambdaExampleforRakesh str = (name, age) -> {
			return "rakesh";
		};
		String s = str.returnRakesh("ram", 5);
		System.out.println(s);
	}
}
