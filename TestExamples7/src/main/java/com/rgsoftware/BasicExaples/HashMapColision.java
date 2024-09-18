package com.rgsoftware.BasicExaples;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapColision {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "Hi");
		map.put(2, "Hello");
		map.put(2, null);
		map.put(3, "Hello");
		map.put(4, "Hello");
		System.out.println(map.get(3));
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		swapNumber(a, b);
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(2, "Hi");
		ht.put(2, "Hello");
		//ht.put(2, null);
		ht.put(3, "Hello");
		ht.put(4, "Hello");
		System.out.println(ht.get(2));
	}

	public static void swapNumber(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			a[i] = b[i];
			b[i] = temp;
		}
	}
}
