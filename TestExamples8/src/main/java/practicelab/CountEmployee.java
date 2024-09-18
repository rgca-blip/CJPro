package practicelab;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = Arrays.asList(new Employee("John", 35, "Male", "IT", 60000d),
				new Employee("Steve", 38, "Male", "IT", 75000d), new Employee("Mike", 32, "Male", "IT", 90000d),
				new Employee("David", 30, "Male", "HR", 70000d), new Employee("Chris", 31, "Male", "HR", 85000d),
				new Employee("Jake", 40, "Male", "HR", 95000d), new Employee("Paul", 36, "Male", "Finance", 80000d),
				new Employee("Tom", 33, "Male", "Finance", 78000d), new Employee("Eric", 39, "Male", "Finance", 88000d),
				new Employee("Riya", 39, "Female", "Finance", 86000d),
				new Employee("Saniya", 39, "Female", "Finance", 78000d));
		Map<String, Long> empl = employeeList.stream().filter(emp -> emp.getAge() > 35)
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(empl);
	}

}