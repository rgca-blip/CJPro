package practicelab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheListOfNumberAscAndDescOrder {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(7, 4, 1, 8, 5, 2, 2, 9, 6, 3, 2, 5, 8);
		System.out.println("Ascending order....");
		list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("Descnding order....");
		list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
	}

}
