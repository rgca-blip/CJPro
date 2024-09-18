package com.rgsoftware.java8testslambda20012024;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//Filter the even data:: priting
//Filter the even data collect as a list:: priting
//Filter the even data collect as a set:: priting
//Filter the even data find the first element:: priting
//Before filter the even data find the first element:: priting
//Before filter the even data find the specific element:: priting
//Filter the even data find the specific element:: priting
//Before filter the even data count:: priting
//Filter the even data count:: priting
public class FilterExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 6, 8, 3, 6, 9, 2, 8);
		numbers.forEach(number -> System.out.println(number));
		System.out.println("****Filter the even data:: priting****");
		numbers.stream().filter(number -> number % 2 == 0).forEach(n -> System.out.println(n));
		System.out.println("****Filter the even data collect as a list:: priting****");
		List<Integer> evenList = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);
		System.out.println("****Filter the even data collect as a set:: priting****");
		Set<Integer> evenSet = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toSet());
		System.out.println(evenSet);
		System.out.println("****Filter the even data find the first element:: priting****");
		int i = numbers.stream().filter(number -> number % 2 == 0).findFirst().get();
		System.out.println(i);
		System.out.println("****Before filter the even data find the first element:: priting****");
		int j = numbers.stream().findFirst().get();
		System.out.println(j);
		System.out.println("****Before filter the even data find the specific element:: priting****");
		int k = numbers.stream().skip(3).findFirst().get();
		System.out.println(k);
		System.out.println("****Filter the even data find the specific element:: priting****");
		int l = numbers.stream().filter(n -> n % 2 == 0).skip(2).findFirst().get();
		System.out.println(l);
		System.out.println("****Before filter the even data count:: priting****");
		long m = numbers.stream().count();
		System.out.println(m);
		System.out.println("****Filter the even data count:: priting****");
		long o = numbers.stream().filter(n -> n % 2 == 0).count();
		System.out.println(o);
	}
}
