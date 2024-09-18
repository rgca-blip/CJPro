package practicelab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheCommonElementOfTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num1 = Arrays.asList(7, 4, 2, 5, 8, 9, 6, 3);
		List<Integer> num2 = Arrays.asList(45, 8, 61, 0, 2, 3, 48);
		List<Integer> number = num1.stream().filter(num2::contains).collect(Collectors.toList());
		System.out.println(number);
	}

}
