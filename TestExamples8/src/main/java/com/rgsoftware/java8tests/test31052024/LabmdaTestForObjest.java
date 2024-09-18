package com.rgsoftware.java8tests.test31052024;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.rgsoftware.java8tests.dto.EmployeeDto;

public class LabmdaTestForObjest {

	public static void main(String[] args) {

		// 1.filter the names start with "k" print the data.
		// 2.filter the names start with "k" & length == 4 take as a list format.
		// 3.filter the names start with "k" & length == 4 take as a set format.
		// 4.filter the names start with "r" count the data.
		// 5.filter the names start with "r" find the first element.
		// 6.filter the names start with "r" find the 3 element.
		List<Integer> list = Arrays.asList(6, 9, 5, 3, 2, 4, 9, 8, 1, 7, 6, 7, 2);
		List<String> names = Arrays.asList("ratan", "raju", "rani", "radha", "rakesh", "krishna", "king", "queen",
				"pillaka", "challaka", "mallaka");
		List<EmployeeDto> eList = List.of(new EmployeeDto(1001, "Ratan", 1253689d),
				new EmployeeDto(104, "Krishna", 95265d), new EmployeeDto(105, "rakesh", 21333d),
				new EmployeeDto(108, "mani", 95698545d), new EmployeeDto(102, "king", 74102d));
		// list.stream().filter(i -> i % 2 == 0).sorted().map(m -> m * 10).forEach(num
		// -> System.out.println(num));
		List<Integer> l = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l);
		String str = "Hi good morning";
		String reserved = new StringBuilder(str).reverse().toString();
		System.out.println(reserved);
		Set<Integer> l1 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toSet());
		System.out.println(l1);
		System.out.println('F' + 'I' + 'T');
		System.out.println('A' + 'B');
		int[] in = new int[1];
		Double[] d = new Double[142457993];
		Boolean[] b = new Boolean[-1];
		char[] c = new char[20];
		System.out.println('f' + 'i' + 'j');
		Optional<Integer> i = list.stream().sorted().skip(1).findFirst();
		System.out.println(i);
		List<Integer> sset = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(sset);
		long count = list.stream().count();
		System.out.println(count);
		int ii = list.stream().filter(num -> num % 2 == 0).findFirst().get();
		System.out.println(ii);
		List<String> n = names.stream().filter(name -> name.startsWith("k")).collect(Collectors.toList());
		System.out.println(n);
		List<String> r = names.stream().filter(name -> name.startsWith("r") && name.length() == 4)
				.collect(Collectors.toList());
		System.out.println(r);
		long coun = names.stream().filter(name -> name.startsWith("r")).count();
		System.out.println(coun);
		String nam = names.stream().filter(name -> name.startsWith("r")).findFirst().get();
		System.out.println(nam);
		String sna = names.stream().filter(name -> name.startsWith("r")).skip(3).findFirst().get();
		System.out.println(sna);
		eList.stream().filter(emp -> emp.employeeId == 102)
				.forEach(emp -> System.out.println(emp.employeeName + ",," + emp.employeeSalary));
	}

}
