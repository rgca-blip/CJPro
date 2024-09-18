package corfoseiap;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("The name of the person is :");
		String name = sc.nextLine();
		System.out.println("and the age is :");
		int age = sc.nextInt();
		System.out.println("The name of the person is " + name + " and the age is " + age);*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your length here :");
		int length=sc.nextInt();
		System.out.println("Enter your breadth bere :");
		int  breadth=sc.nextInt();
		int area=length*breadth;
		System.out.println("your area is "+area);
		sc.close();

	}

}
