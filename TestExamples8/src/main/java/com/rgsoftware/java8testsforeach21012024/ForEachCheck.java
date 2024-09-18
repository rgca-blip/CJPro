package com.rgsoftware.java8testsforeach21012024;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEachCheck {
	public static void main(String[] args) {
		System.out.println("Hi Good Morning");
		List<Integer> list = Arrays.asList(1, 2, 3);
		list.forEach(num -> System.out.println(num + " "));
		Set<String> set = Set.of("Hello", "Hi", "bye bye");
		set.forEach(string -> System.out.println(string));
		Map<String, Integer> map = Map.of("Hello", 1, "Hi", 2, "bye bye", 3);
		map.forEach((k, v) -> System.out.println(k + " " + v));

		List<Employee> lists = Arrays.asList(new Employee(1, "raghupati", 1.00), new Employee(2, "raghav", 22.00),
				new Employee(3, "rajaram", 333.00));
		lists.forEach(emp -> System.out.println(emp.eid + " " + emp.ename + " " + emp.esal + " "));

		Set<Employee> sets = Set.of(new Employee(4, "omm", 4444.00), new Employee(5, "namaha", 55555.00),
				new Employee(6, "sibaya", 666666.00));
		sets.forEach(emp -> System.out.println(emp.eid + " " + emp.ename + " " + emp.esal + " "));

		Map<Integer, Employee> maps = Map.of(7, new Employee(7, "jay", 7777777.00), 8,
				new Employee(8, "shree", 88888888.00), 9, new Employee(9, "ram", 999999999.00));

		maps.forEach((k, v) -> System.out.println(k + " " + v.eid + " " + v.ename + " " + v.esal + " "));
	}
}

class Employee {
	int eid;
	String ename;
	double esal;

	public Employee(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
}