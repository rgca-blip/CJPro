package com.rgsoftware.BasicExaples;

import java.util.Scanner;

public class Rectangle {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		int rectagnle = length * breadth;
		System.out.println(rectagnle);
		sc.close();
	}
}
