package corfoseiap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class IQTest {

	public static void main(String[] args) {
		// List<Integer> in=List.of(13,35,46,65,null,86,99);
		// 3+5+6+5+6+9=34 out put

		List<Integer> number = List.of(13, 35, 46, 65, 86, 99);
		List<Integer> number1 = Arrays.asList(13, 35, 46, 65, null, 86, 99);

		int n = number.stream().mapToInt(Integer::intValue).sum();
		System.out.println(n / 10);

		int val = number1.stream().reduce((i, j) -> i + j).map(map -> map / 10).get();
		System.out.println("val : " + val);

		String string = "hi rakesh";
		String sb = new StringBuilder(string).reverse().toString();
		// System.out.println(sb);
	}

}
