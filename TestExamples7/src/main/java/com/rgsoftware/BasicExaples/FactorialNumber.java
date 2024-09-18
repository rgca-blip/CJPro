package com.rgsoftware.BasicExaples;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		System.out.println(factorial);
		sc.close();
	}

}
