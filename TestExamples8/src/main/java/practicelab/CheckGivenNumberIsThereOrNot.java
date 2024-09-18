package practicelab;

import java.util.Arrays;
import java.util.List;

public class CheckGivenNumberIsThereOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = Arrays.asList(7, 7, 4, 1, 8, 5, 2, 9, 6, 3);
		int numberToCheck = 10;
		Boolean isPresent = num.stream().anyMatch(n -> n == numberToCheck);
		if (isPresent) {
			System.out.println("Number is present");
		} else
			System.out.println("Number is Not Present");
	}

}
