package com.rgsoftware.java8tests.test05062024;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class InformationDetails {
	private String name;
	private int salary;

	public InformationDetails(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "InformationDetails [name=" + name + ", salary=" + salary + "]";
	}
}

public class LambdaForSortFunction {

	public static void main(String[] args) {
		List<InformationDetails> info = List.of(new InformationDetails("jhon", 12546),
				new InformationDetails("girold", 10325), new InformationDetails("mike", 125946),
				new InformationDetails("jhon", 2546), new InformationDetails("grek", 125460));
		List<String> names = List.of("ramesh", "prema", "hemanta", "sameer", "happy");
		List<String> arraynames = Arrays.asList("ramesh", "prema", "hemanta", "sameer", "happy");
		Collections.sort(arraynames);
		// System.out.println(arraynames);
		Collections.sort(arraynames, Comparator.reverseOrder());
		// System.out.println(arraynames);
		List<String> na = names.stream().sorted().collect(Collectors.toList());
		// System.out.println(na);
		// List<String> nameslist = List.of("ramesh", "prema", "hemanta", "sameer",
		// "happy");
		// List<String> arraynameslist = Arrays.asList("ramesh", "prema", "hemanta",
		// "sameer", "happy");
		// nameslist.sort(arraynameslist);
		List<InformationDetails> l = info.stream().sorted().collect(Collectors.toList());
		System.out.println(l);
	}

}
