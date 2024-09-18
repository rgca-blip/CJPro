package com.rgsoftware.java8tests.test05222024;

@FunctionalInterface
interface AllInOneInterface1 {
	void testMethod();
}

public class Java8ExamplesfirstTest {

	public static void main(String[] args) {
		AllInOneInterface1 a = () -> System.out.println("this is mine");
		a.testMethod();
		System.out.println("Hi");
		AllInOneInterface1 b = () -> System.out.println("this is your");
		System.out.println("this is mine");
		b.testMethod();
	}
}
