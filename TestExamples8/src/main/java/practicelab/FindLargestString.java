package practicelab;

import java.util.Arrays;
import java.util.Comparator;

public class FindLargestString {

	public static void main(String[] args) {
		String centence = "find my fault";
		String words[] = centence.split(" ");
		String largeString = Arrays.stream(words).max(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println(largeString);
	}
}
