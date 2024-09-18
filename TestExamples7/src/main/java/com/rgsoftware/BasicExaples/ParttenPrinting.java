package com.rgsoftware.BasicExaples;

public class ParttenPrinting {

	public static void main(String[] args) {
		int num = 10;
		for (int i = num; i >=1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
