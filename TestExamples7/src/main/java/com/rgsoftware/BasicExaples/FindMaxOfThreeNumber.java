package com.rgsoftware.BasicExaples;

public class FindMaxOfThreeNumber {

	public static void main(String[] args) {
		int num1 = 10, num2 = 15, num3 = 20, max;
		max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
		System.out.println("Maximum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + max);

	}

}
