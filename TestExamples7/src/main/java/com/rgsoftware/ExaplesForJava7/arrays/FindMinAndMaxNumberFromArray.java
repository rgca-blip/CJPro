package com.rgsoftware.ExaplesForJava7.arrays;

public class FindMinAndMaxNumberFromArray {

	public static void main(String[] args) {
		FindMinAndMaxNumberFromArray.minFunction();
		FindMinAndMaxNumberFromArray.maxFunction();
	}

	public static void minFunction() {
		int[] numbers = { 2, 5, 6, 3, 4, 8, 9, 7 };
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("min : " + min);
	}

	public static void maxFunction() {
		int[] numbers = { 9, 6, 8, 5, 3, 4, 7, 2, 1 };
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("max : " + max);
	}
}
