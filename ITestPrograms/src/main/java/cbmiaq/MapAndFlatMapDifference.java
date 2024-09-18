package cbmiaq;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMapDifference {

	public static void main(String[] args) {

		List<List<String>> nestedList = Arrays.asList(Arrays.asList("A", "B", "C"), Arrays.asList("D", "E", "F"),
				Arrays.asList("G", "H", "I"));

		HashMap<String, Integer> map = new HashMap<>();
		map.put("Apple", 1);
		map.put("Banana", 2);
		System.out.println(map.get("Banana"));
		List<String> sl = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(sl);

		Object obj1 = new HashMap<String, Integer>();
		Object obj2 = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4)).flatMap(List::stream);

		if (obj1 instanceof HashMap) {
			System.out.println("obj1 is a HashMap");
		}

		if (obj2 instanceof Stream) {
			System.out.println("obj2 is a Stream (possibly created with flatMap)");
		}

		List<Integer> number = Arrays.asList(7, 4, 1, 8, 5, 2);
		List<Integer> number2 = Arrays.asList(9, 6, 3, 8, 5, 2);
		Stream.concat(number.stream(), number2.stream()).sorted().collect(Collectors.toSet())
				.forEach(System.out::print);

		System.out.println(" ");

		List<List<Integer>> numb = Arrays.asList(number, number2);
		Set<Integer> in = numb.stream().flatMap(List::stream).sorted().collect(Collectors.toSet());
		System.out.println(in);
	}

}
