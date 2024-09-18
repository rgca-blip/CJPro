package com.rgsoftware.java8tests.test02062024;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.rgsoftware.java8tests.dto.EmployeeDto;

public class LambdaForObject {

	// 1.filter the names start with "k" print the data.
	// 2.filter the names start with "k" & length == 4 take as a list format.
	// 3.filter the names start with "k" & length == 4 take as a set format.
	// 4.filter the names start with "r" count the data.
	// 5.filter the names start with "r" find the first element.
	// 6.filter the names start with "r" find the 3 element.
	public static void main(String[] args) {

		List<EmployeeDto> eList = List.of(new EmployeeDto(1001, "ratan", 1253689d),
				new EmployeeDto(104, "krishna", 95265d), new EmployeeDto(105, "rakesh", 21333d),
				new EmployeeDto(108, "mani", 95698545d), new EmployeeDto(102, "king", 74102d));
		System.out.println(eList);

		eList.stream().forEach(emp -> System.out.println(emp.employeeName));
		System.out.println("******filter the names start with \"k\" print the data.*******");
		eList.stream().filter(emp -> emp.employeeName.startsWith("k"))
				.forEach(emp -> System.out.println(emp.employeeName));
		System.out.println("******filter the names start with \"k\" & length == 4 take as a list format.*******");
		eList.stream().filter(emp -> emp.employeeName.startsWith("k") && emp.employeeName.length() == 4)
				.forEach(emp -> System.out.println(emp.employeeName));
		eList.stream().filter(emp -> emp.employeeName.length() > 4)
				.forEach(emp -> System.out.println(emp.employeeName));
		List<EmployeeDto> empList = eList.stream().filter(emp -> emp.employeeName.startsWith("k"))
				.collect(Collectors.toList());
		System.out.println(empList);
		System.out.println("******filter the names start with \"r\" count the data.*******");
		long count = eList.stream().filter(emp -> emp.employeeName.startsWith("r")).count();
		System.out.println(count);
		Optional<EmployeeDto> s = eList.stream().filter(emp -> emp.employeeName.startsWith("r")).skip(1).findFirst();
		System.out.println(s);
		List<EmployeeDto> ld = eList.stream().sorted().collect(Collectors.toList());
		ld.forEach(System.out::print);

		eList.stream().filter(emp -> emp.employeeName.length() > 4)
				.forEach(emp -> System.out.println(emp.employeeName));
	}

}
