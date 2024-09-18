package practicelab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllEvenNumberFromExisingList {

	public static void main(String[] args) {
		List<Integer> even = Arrays.asList(12, 3, 65, 47, 99, 63, 25, 47, 8, 9, 6, 2, 58);
		List<Integer> number = even.stream().filter(evenNumber -> evenNumber % 2 == 0).collect(Collectors.toList());
		System.out.println(number);
	}

}
