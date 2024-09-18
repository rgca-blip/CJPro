package com.rgsoftware.java8tests.test02062024;

import java.util.List;
import java.util.stream.Collectors;

import com.rgsoftware.java8tests.dto.EmployeeDto;

//for every number add 2 ,,like 12+2=14
//for nading sare name for employee ,, like rakesh gouda
//multiply by 5 for all odd number
//multiply by 11 for all even number and collect as a list
//salary multiply by 5
//employee who start with r add sure name for this employee
//whose employee salary above 74102 for that employee name add sure name
//find the value above 50 and multiply by 10 and combine all value together
public class LambdaForObject1 {

	public static void main(String[] args) {
		List<Integer> number = List.of(12, 32, 45, 10, 78, 93, 50);
		List<String> names = List.of("kanhu", "raghu", "rakesh", "siba", "paresh", "goutam", "situ");
		List<EmployeeDto> employees = List.of(new EmployeeDto(1001, "ratan", 1253689d),
				new EmployeeDto(104, "krishna", 95265d), new EmployeeDto(105, "rakesh", 21333d),
				new EmployeeDto(108, "mani", 95698545d), new EmployeeDto(102, "king", 74102d));
		System.out.println("Hi hello");
		//for every number add 2 ,,like 12+2=14
		number.stream().map(num -> num + 2).forEach(num -> System.out.println(num));
		//for nading sare name for employee ,, like rakesh gouda
		names.stream().filter(name -> name.equals("rakesh")).map(name -> name + " gouda")
				.forEach(name -> System.out.println(name));
		//multiply by 5 for all odd number
		number.stream().filter(num -> num % 2 == 1).map(map -> map * 5).forEach(num -> System.out.println(num));
		//multiply by 11 for all even number and collect as a list
		List<Integer> num = number.stream().filter(numm -> numm % 2 == 0).map(map -> map * 11)
				.collect(Collectors.toList());
		System.out.println(num);
		//salary multiply by 5
		List<Double> e = employees.stream().filter(emp -> emp.employeeSalary < 25638).map(emp -> emp.employeeSalary * 5)
				.collect(Collectors.toList());
		System.out.println(e);
		//employee who start with r add sure name for this employee
		employees.stream().filter(emp -> emp.employeeName.startsWith("r")).map(emp -> emp.employeeName + " biswal")
				.forEach(emp -> System.out.println(emp));
		//whose employee salary above 74102 for that employee name add sure name
		List<String> na = employees.stream().filter(emp -> emp.employeeSalary > 74102)
				.map(emp -> emp.employeeName + " routa ").collect(Collectors.toList());
		System.out.println(na);
		//find the value above 50 and multiply by 10 and combine all value together
		Integer num1 = number.stream().filter(numb -> numb > 50).map(numb -> numb * 10).reduce((i, j) -> i + j).get();
		System.out.println(num1);
		String nam = names.stream().filter(name -> (name.startsWith("s") || name.startsWith("r")) && name.length() == 4)
				.map(map -> " bandhan " + map).reduce((name1, name2) -> name1 + name2).get();
		System.out.println(nam);
		String enames = employees.stream().filter(emp -> emp.employeeId > 105).map(emp -> " beauty " + emp.employeeName)
				.reduce((emp1, emp2) -> emp1 + emp2).get();
		System.out.println(enames);
	}

}
