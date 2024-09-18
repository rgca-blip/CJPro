/*package practicelab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Top3MaleEmployee {

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(new Employee("John", 35, "Male", "IT", 60000d),
				new Employee("Steve", 38, "Male", "IT", 75000d), new Employee("Mike", 32, "Male", "IT", 90000d),
				new Employee("David", 30, "Male", "HR", 70000d), new Employee("Chris", 31, "Male", "HR", 85000d),
				new Employee("Jake", 40, "Male", "HR", 95000d), new Employee("Paul", 36, "Male", "Finance", 80000d),
				new Employee("Tom", 33, "Male", "Finance", 78000d), new Employee("Eric", 39, "Male", "Finance", 88000d),
				new Employee("Riya", 39, "Female", "Finance", 86000d),
				new Employee("Saniya", 39, "Female", "Finance", 78000d));

		Map<String, List<Employee>> employeeByDept = employeeList.stream()
				.filter(e -> e.getName().equalsIgnoreCase("Male")).filter(e -> e.getAge() >= 30 && e.getAge() <= 40)
				.collect(Collectors.groupingBy(Employee::getDepartment));
		Map<String, List<Employee>> topEmployeeDept = new HashMap<>();
		List<Employee> top3Employee = employeeByDept.forEach((department, emplList) -> {
			employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3)
					.collect(Collectors.toList());
			topEmployeeDept.put(department, top3Employee);
		});
	}
}
*/