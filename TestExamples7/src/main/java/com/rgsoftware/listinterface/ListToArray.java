package com.rgsoftware.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<String> data = new ArrayList<String>();
		data.add("ram");
		data.add("shyam");
		data.add("dham");
		System.out.println(data);
		String[] names = data.toArray(new String[data.size()]);
		System.out.println(Arrays.toString(names));
		for (String name : names) {
			System.out.println(name.toString());
		}
	}

}
