package com.rgsoftware.java8testslambda22022024;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int number = list.stream().filter(n -> n % 2 == 1).mapToInt(i -> i * i).sum();
		System.out.print(number);
		List<String> list1=Arrays.asList("cherry","orange","banana","apple","mango");
		List<String> strings=list1.stream().sorted().collect(Collectors.toList());
		System.out.println(strings);
		Map<Integer, List<String>> s=list1.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(s);
		List<String> sList=Arrays.asList("AAA","A","AAAA","AA","XXX","AAAAA");
		Map<Integer, List<String>> li=sList.stream().sorted().collect(Collectors.groupingBy(String::length));
		System.out.println(li);
	}

}
