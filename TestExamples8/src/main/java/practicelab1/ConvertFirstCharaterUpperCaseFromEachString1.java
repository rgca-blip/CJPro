package practicelab1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertFirstCharaterUpperCaseFromEachString1 {
	public static void main(String[] args) {
		String centence = "hi chandra where are you from";
		String result = Arrays.stream(centence.split(" "))
				.map(word -> word.substring(0, 1).toUpperCase() + word.substring(1)).collect(Collectors.joining(" "));
		System.out.println(result);
	}
}
