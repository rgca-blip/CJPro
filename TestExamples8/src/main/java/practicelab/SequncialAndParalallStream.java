package practicelab;

import java.util.Arrays;
import java.util.List;

public class SequncialAndParalallStream {
	public static void main(String[] args) {
		List<String> slist = Arrays.asList("hi", "hello", "bye", "bye", "tata", "hi");
		System.out.println("Sequncial Stream....");
		slist.stream().forEach(System.out::println);
		System.out.println("Parallal Stream....");
		slist.parallelStream().forEach(System.out::println);
	}
}
