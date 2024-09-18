package com.rgsoftware.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToArray1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(41);
		list.add(48);
		list.add(14);
		list.add(24);
		list.add(40);
		System.out.println(list);
		Integer[] nums = list.toArray(new Integer[list.size()]);
		System.out.println(Arrays.toString(nums));
		List<Integer> n = list.stream().sorted().collect(Collectors.toList());
		System.out.println(n);
		for (int num : nums) {
			System.out.print(num + ",");
		}
	}

}
