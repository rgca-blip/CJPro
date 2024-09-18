package com.rgsoftware.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToArray4 {

	public static void main(String[] args) {

		List<String> slist = new ArrayList<>();
		Set<Character> set = new HashSet<>();
		slist.add("hello");
		slist.add("hi");
		slist.add("tata");
		slist.add("byebye");
		String[] names = slist.toArray(new String[slist.size()]);
		System.out.println(Arrays.toString(names));
		String s = "";
		for (String n : names)
			s += n;
		char[] c = s.toCharArray();
		// Map<String, Long> output =
		// Arrays.stream(c).collect(Collectors.groupingBy(Function.identity(),
		// Collectors.counting()));
		// System.out.println("Output : "+output);
		Arrays.sort(c);
		for (char ch : c) {
			set.add(ch);
		}
		System.out.print(set);
		System.out.println("");
		String[] na = slist.stream().toArray(String[]::new);
		Arrays.stream(na).sorted().forEach(System.out::print);
		System.out.println("");

		List<Integer> ilist = new ArrayList<>();
		ilist.add(6);
		ilist.add(9);
		ilist.add(3);
		ilist.add(5);
		ilist.add(5);
		Set<Integer> in = new HashSet<>();
		in.addAll(ilist);
		System.out.println(in);
	}
}
