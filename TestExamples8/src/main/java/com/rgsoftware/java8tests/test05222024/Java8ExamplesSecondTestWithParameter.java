package com.rgsoftware.java8tests.test05222024;

public class Java8ExamplesSecondTestWithParameter {

	public static void main(String[] args) {
		AllInOneInterface i = (a, b) -> System.out.println("please Execute = " + (a + b));
		i.testMethod(10, 20);
	}

}
