package practicelab;

import java.util.Random;
import java.util.Scanner;

public class TakeANumberNAndGenerateRandomN {

	public static void main(String[] args) {
		System.out.println("How many number you want to print.....");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Random random = new Random();
		random.ints(11, 99).limit(n).forEach(System.out::println);
		sc.close();
	}

}
