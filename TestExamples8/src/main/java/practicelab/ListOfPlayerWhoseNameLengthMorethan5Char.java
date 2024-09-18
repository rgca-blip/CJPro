package practicelab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfPlayerWhoseNameLengthMorethan5Char {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sachin", "Birandra", "Rahul", "Mahi", "Yuvi");
		names.stream().filter(name -> name.length() > 5).collect(Collectors.toList()).forEach(System.out::println);
	}

}
