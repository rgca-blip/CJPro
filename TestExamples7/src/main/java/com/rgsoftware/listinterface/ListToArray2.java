package com.rgsoftware.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToArray2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("ram");
		names.add("laxman");
		names.add("bharat");
		names.add("satrughna");
		System.out.println(names);
		String[] name = names.toArray(new String[names.size()]);
		List<String> m = names.stream().sorted().collect(Collectors.toList());
		System.out.println(m);
		System.out.println(Arrays.toString(name));
		for (String n : name) {
			System.out.print(n + ",");
		}
		System.out.println("");
		String[] nam = names.stream().toArray(String[]::new);
		Arrays.stream(nam).sorted().forEach(System.out::println);
	}

}
