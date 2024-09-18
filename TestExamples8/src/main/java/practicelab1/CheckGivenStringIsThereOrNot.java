package practicelab1;

import java.util.Arrays;
import java.util.List;

public class CheckGivenStringIsThereOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List<Integer> number= Arrays.asList(4, 1, 7, 8, 5, 2, 9, 6, 3); int
		 * numberCheck = 5; Boolean isPresent = number.stream().anyMatch(n -> n ==
		 * numberCheck); if (isPresent) { System.out.println("number is present"); }
		 * else System.out.println("number is not present");
		 */
		List<String> chars = Arrays.asList("hi savita", "vita", "eagle", "ganga", "yellow", "wow", "nnumber", "ant");
		String ch = "hi";
		Boolean isPresent = chars.stream().anyMatch(n -> n == ch);
		if (isPresent) {
			System.out.println("is present");
		} else
			System.out.println("not present");
	}

}
