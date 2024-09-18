package practicelab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MInMaxAverageSumCountListOfNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 34, 56, 98, 74, 52, 65, 1);
		Integer min = list.stream().sorted().findFirst().get();
		// Integer min1 = list.stream().mapToInt(Integer::intValue).min().getAsInt();
		System.out.println("Min : " + min);
		Integer max = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		// Integer max1 = list.stream().mapToInt(Integer::intValue).max().getAsInt();
		System.out.println("Max : " + max);
		Double average = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println("Average : " + average);
		Integer sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum : " + sum);
		long count = list.stream().count();
		System.out.println("Count : " + count);
	}
}
