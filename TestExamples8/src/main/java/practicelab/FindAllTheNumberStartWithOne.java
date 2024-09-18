package practicelab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllTheNumberStartWithOne {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(121, 31, 3, 145, 15, 13, 1, 614, 14, 61, 41, 11, 51, 53, 171, 8, 19);
		List<String> num = number.stream().map(s -> s + "").filter(n -> n.startsWith("1")).collect(Collectors.toList());
		System.out.println(num);
	}

}
