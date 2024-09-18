package practicelab;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LengthOfCharacter {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("ram", "laxman", "bharata", "satrughna", "hanuman");
		Map<Integer, List<String>> map = list.stream().collect(Collectors.groupingBy(String::length));
		map.forEach((integer, string) -> System.out.println(integer + "" + string));
	}
}
