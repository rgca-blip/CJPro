package practicelab;

import java.util.Arrays;
import java.util.List;

public class MapAndFlatMap {

	public static void main(String[] args) {
		List<String> ls = Arrays.asList("hi", "hello", "bye", "bye", "tata", "hi");
		List<List<String>> lls = Arrays.asList(Arrays.asList("hi", "hello", "bye", "bye", "tata", "hi"),
				Arrays.asList("bikash", "akash", "bina", "rina", "tata", "hello"));
		ls.stream().map(str -> str.length()).distinct().forEach(System.out::println);
		lls.stream().map(llss -> llss.stream().map(str -> str.length())).distinct().forEach(System.out::println);
		lls.stream().flatMap(llss -> llss.stream().map(str -> str.length())).distinct().forEach(System.out::println);
	}

}
