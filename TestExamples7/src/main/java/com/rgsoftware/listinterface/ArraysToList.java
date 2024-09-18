package com.rgsoftware.listinterface;

import java.util.Scanner;

public class ArraysToList {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int startFahrenheit = scanner.nextInt();
	        int endFahrenheit = scanner.nextInt();
	        int stop = scanner.nextInt();
	        for (int currentFahrenheit = startFahrenheit; currentFahrenheit <= endFahrenheit; currentFahrenheit += stop) {
	            int celsius =(int) ((5.0 / 9) * (currentFahrenheit - 32));
	            System.out.println(currentFahrenheit+"\t"+celsius);
	        }
	        scanner.close();
	}

}
