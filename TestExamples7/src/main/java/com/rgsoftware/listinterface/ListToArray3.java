package com.rgsoftware.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListToArray3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(15);
		list.add(55);
		list.add(59);
		list.add(65);
		list.add(58);
		System.out.println(list);
		Integer[] numbers = list.toArray(new Integer[list.size()]);
		System.out.println(Arrays.toString(numbers));
		Collections.sort(list);
		System.out.println(list);
		for (int number : numbers) {
			System.out.print(number + ",");
		}
		System.out.println("");
		Integer[] num = list.stream().toArray(Integer[]::new);
		Arrays.stream(num).sorted().forEach(System.out::println);
	}

}
