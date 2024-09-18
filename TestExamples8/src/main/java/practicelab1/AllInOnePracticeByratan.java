package practicelab1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.rgsoftware.java8tests.dto.EmployeeDto;

import practicelab.Employee;

//find odd and even number
//Filter the even data collect as a list:: priting
//Filter the even data collect as a set:: priting
//find average
//find the sum of all element in array
// find the average of all element in array
// find the min and max value from array
// 7.for every number add 2 ,,like 12+2=14
// 9.multiply by 5 for all odd number
// 10.multiply by 11 for all even number and collect as a list
// 14.find the value above 50 and multiply by 10 and combine all value together
//1.filter the names start with "r" print the data.
// 2.filter the names start with "k" & length == 4 take as a list format.
//3.filter the names start with "k" & length == 4 take as a set format.
// 4.filter the names start with "r" count the data.
// 5.filter the names start with "r" find the first element.
//6.filter the names start with "r" find the 3 element.
// 8.for adding sare name for employee ,, like rakesh gouda
//murge string list by concat
// murge string list by flatMap
//Filter the even data find the first element:: priting
//Before filter the even data find the first element:: priting
//Before filter the even data find the specific element:: priting
//Filter the even data find the specific element:: priting
//Before filter the even data count:: priting
//Filter the even data count:: priting
//7.for every number add 2 ,,like 12+2=14
//8.for adding sare name for employee ,, like rakesh gouda
//9.multiply by 5 for all odd number
//10.multiply by 11 for all even number and collect as a list
//11.salary multiply by 5
//12.employee who start with r add sure name for this employee
//13.whose employee salary above 74102 for that employee name add sure name
//14.find the value above 50 and multiply by 10 and combine all value together
//List<Integer> in=List.of(13,35,46,65,null,86,99); OUTPUT :  3+5+6+5+6+9=34 
//find duplicate character from a string
//Find the employee working in specific department like "HR"
//Find the employee with the highest salary
public class AllInOnePracticeByratan {

	private static String string = "challaka";
	private static String secentence = "find duplicate character from a string";
	private static List<Integer> numbers1 = List.of(7, -4, 1, 8, 5, -2, 9, 6, 3, -7, 4, 1, 0, -8, 5, 2);
	private static List<Integer> numbers2 = Arrays.asList(3, 6, 9, 2, 5, 8, 1, 4, 7);
	private static List<String> names1 = List.of("ramesh", "prema", "hemanta", "sameer", "happy");
	private static List<String> names2 = Arrays.asList("ratan", "raju", "rani", "radha", "rakesh", "krishna", "king",
			"queen", "pillaka", "challaka", "mallaka");
	private static List<EmployeeDto> employeeList1 = List.of(new EmployeeDto(1001, "ratan", 1253689d),
			new EmployeeDto(104, "krishna", 95265d), new EmployeeDto(105, "rakesh", 21333d),
			new EmployeeDto(108, "mani", 95698545d), new EmployeeDto(102, "king", 74102d));
	private static List<Employee> employeeList2 = Arrays.asList(new Employee("John", 35, "Male", "IT", 60000d),
			new Employee("Steve", 38, "Male", "IT", 75000d), new Employee("Mike", 32, "Male", "IT", 90000d),
			new Employee("David", 30, "Male", "HR", 70000d), new Employee("Chris", 31, "Male", "HR", 85000d),
			new Employee("Jake", 40, "Male", "HR", 95000d), new Employee("Paul", 36, "Male", "Finance", 80000d),
			new Employee("Tom", 33, "Male", "Finance", 78000d), new Employee("Eric", 39, "Male", "Finance", 88000d),
			new Employee("Riya", 39, "Female", "Finance", 86000d),
			new Employee("Saniya", 39, "Female", "Finance", 78000d));

	public static void main(String[] args) {
		// numbersFunction();
		// stringFunction();
		objectFunction();
	}

	public static void numbersFunction() {

		numbers1.stream().filter(num -> num % 2 == 0).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println(" ");
		numbers2.stream().filter(num -> num % 2 == 1).collect(Collectors.toList()).forEach(System.out::print);

		List<Integer> l1 = Arrays.asList(1, 2, 3, 2, 4, 5);
		List<Integer> l2 = Arrays.asList(4, 5, 5, 6, 7, 8);
		Set<Integer> result = Stream.concat(l1.stream(), l2.stream()).sorted().collect(Collectors.toSet());
		System.out.println(result);

		List<List<Integer>> sublist = Arrays.asList(l1, l2);
		// List<Integer> sl =
		// sublist.stream().flatMap(Collections::stream).collect(Collectors.toList());

		int num = numbers1.stream().mapToInt(i -> i).sum();
		System.out.println(num);

		OptionalDouble num1 = numbers1.stream().mapToDouble(i -> i).average();
		System.out.println(num1);

		OptionalInt num2 = numbers1.stream().mapToInt(i -> i).min();
		Integer num20 = numbers1.stream().reduce(Integer::min).get();
		System.out.println(num2);

		int value = 6;
		boolean num3 = numbers1.stream().anyMatch(n -> n == value);
		System.out.println(num3);

		List<Integer> num4 = numbers1.stream().map(map -> map + 2).collect(Collectors.toList());
		System.out.println(num4);

		List<Integer> num5 = numbers1.stream().filter(n -> n % 2 == 1).map(m -> m * 5).collect(Collectors.toList());
		System.out.println(num5);

		List<Integer> num6 = numbers1.stream().filter(n -> n % 2 == 0).map(m -> m * 11).collect(Collectors.toList());
		System.out.println(num6);

		int num7 = numbers1.stream().filter(n -> n > 5).map(m -> m * 10).reduce((j, r) -> j + r).get();
		System.out.println(num7);

		int val = numbers1.stream().reduce((i, j) -> i + j).map(map -> map / 10).get();
		System.out.println("val : " + val);

		int n = numbers2.stream().mapToInt(Integer::intValue).sum();
		System.out.println(n / 10);
	}

	public static void stringFunction() {

		List<String> name1 = names1.stream().filter(name -> name.startsWith("r")).collect(Collectors.toList());
		System.out.println(name1);

		List<String> name = names2.stream().filter(n -> n.startsWith("k") && n.length() > 4)
				.collect(Collectors.toList());
		System.out.println(name);

		Set<String> name2 = names2.stream().filter(na -> na.startsWith("k") && na.length() < 4)
				.collect(Collectors.toSet());
		System.out.println(name2);

		long nu = names2.stream().filter(nam -> nam.startsWith("r")).count();
		System.out.println(nu);

		String name3 = names2.stream().filter(p -> p.startsWith("r")).findFirst().get();
		System.out.println(name3);

		String name4 = names2.stream().filter(pp -> pp.startsWith("r")).skip(2).findFirst().get();
		System.out.println(name4);

		List<String> name5 = names1.stream().map(map -> map + " " + "hadi").collect(Collectors.toList());
		System.out.println(name5);

		// this for integer value
		Set<Integer> nname6 = Stream.concat(numbers1.stream(), numbers2.stream()).sorted().collect(Collectors.toSet());
		// this is for String value
		String name6 = Stream.concat(names1.stream(), names2.stream()).sorted().collect(Collectors.joining(","));
		String name60 = names1.stream().reduce(String::concat).get();

		System.out.println(name6);

		List<List<String>> flist = Arrays.asList(names1, names2);
		Set<String> name7 = flist.stream().flatMap(map -> map.stream()).collect(Collectors.toSet());
		System.out.println(name7);
	}

	public static void objectFunction() {

		// employeeList2.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList()).forEach(System.out::print);
		// Find the employee working in specific department like "HR"
		System.out.println("Find the employee working in specific department like \"HR\"*****************");
		employeeList2.stream().filter(employee -> "HR".equals(employee.getDepartment())).collect(Collectors.toList())
				.forEach(System.out::println);

		// Find the employee with the highest salary
		System.out.println("Find the employee with the highest salary*****************");
		Employee higestSalary = employeeList2.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(higestSalary);

		System.out.println("Find the employee whose grater than sortain amount*****************");
		// Find the employee whose grater than sortain amount
		List<Employee> amount = employeeList2.stream().filter(employee -> employee.getSalary() > 70000)
				.collect(Collectors.toList());
		System.out.println("amount : " + amount);

		// calculate the average salary of all employee
		System.out.println("calculate the average salary of all employee*****************");
		Double averege = employeeList2.stream().mapToDouble(emp -> emp.getSalary()).average().orElse(0.0);
		System.out.println("Average : " + averege);

		// Group the employee based on their department
		System.out.println("Group the employee based on their department*****************");
		Map<String, List<Employee>> employeeBasedOnDepartment = employeeList2.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println("Employee Based On Department : " + employeeBasedOnDepartment);

		// Find the number of employee of each department
		System.out.println("Get the number of employee of each department*****************");
		Map<String, Long> groupByDepartment = employeeList2.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("Group By Department : " + groupByDepartment);

		// sort the employee their salary by descending order
		System.out.println("Sort the employee their salary by descending order*****************");
		List<Employee> descendingOrder = employeeList2.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println("Descending : " + descendingOrder);

		// find the all distinct department fro employee
		System.out.println("Find the all distinct department fro employee *****************");
		List<String> distinctDepartment = employeeList2.stream().map(Employee::getDepartment).distinct()
				.collect(Collectors.toList());
		System.out.println("Distinct Department :" + distinctDepartment);

		// Find all the employee whose name start with "R"
		System.out.println("Find all the employee whose name start with \"R\"*****************");
		List<Employee> startsWith = employeeList2.stream().filter(emp -> emp.getName().startsWith("R"))
				.collect(Collectors.toList());
		System.out.println("StartsWith" + startsWith);

		// Find the second highest paid employee
		System.out.println("Find the second highest paid employee *****************");
		Optional<Employee> secondHighestPaidEmployee = employeeList2.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();

		// partition by two group who are earning above 60000
		System.out.println("partition by two group who are earning above 60000 *****************");
		Map<Boolean, List<Employee>> group = employeeList2.stream()
				.collect(Collectors.partitioningBy(emp -> emp.getSalary() > 60000));
		System.out.println("Partition by group : " + group);

		// partition by two group who Male ad Female
		System.out.println("partition by two group who Male ad Female *****************");
		Map<String, Long> countingMaleAneFemale = employeeList2.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("Partition Male and  Female: " + countingMaleAneFemale);

		// Join the column into a single string by using comma
		System.out.println("Join the column into a single string by using comma*****************");
		String joinByComma = employeeList2.stream().map(Employee::getName).collect(Collectors.joining(","));
		System.out.println("Join By Comma : " + joinByComma);

		// Check all the employee earn more than 750000
		System.out.println("Check all the employee earn more than 750000 *****************");
		boolean allEarnAbove75k = employeeList2.stream().allMatch(emp -> emp.getSalary() > 5000);
		System.out.println("All Earn above 75 k : " + allEarnAbove75k);

		// Find employee who work in the It department and have a salary grater than
		// 60000.
		System.out.println(
				"Find employee who work in the It department and have a salary grater than 60000 *****************");
		List<Employee> itHighSalary = employeeList2.stream()
				.filter(emp -> "IT".equals(emp.getDepartment()) && emp.getSalary() > 60000)
				.collect(Collectors.toList());
		System.out.println("It High Salary : " + itHighSalary);

		// find the employee with highest age
		System.out.println("Find the employee with higest age *****************");
		Optional<Employee> oldAge = employeeList2.stream().max(Comparator.comparing(Employee::getAge));
		System.out.println("Old Age : " + oldAge);

		// Limit the result to only the first 3 emloyee when sorted by salary
		System.out.println("Limit the result to only the first 3 emloyee when sorted by salary *****************");
		List<Employee> topEmployee = employeeList2.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.limit(3).collect(Collectors.toList());
		System.out.println("Top 3 employee : " + topEmployee);

		// Check any employee working in the department =it
		System.out.println("Check any employee working in the IT department *****************");
		boolean anyIt = employeeList2.stream().anyMatch(emp -> "IT".equals(emp.getDepartment()));
		System.out.println("Any It : " + anyIt);

		// Find the total salary paid to all employee
		System.out.println("Find the total salary paid to all employee *****************");
		Double totalSalary = employeeList2.stream().map(Employee::getSalary).reduce((i, j) -> i + j).get();
		Double totalSalary1 = employeeList2.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println("Total salary by reduce method : " + totalSalary);
		System.out.println("Total salary by mapToDouble and sum method : " + totalSalary1);

		// Convert the list of employee to Map<Integer,String> where the key is the
		// employee Id and the value is the employee Name.
		System.out.println(
				"Convert the list of employee to  Map<Integer,String> where the key is the employee Id and the value is the employee Name.");
		Map<Integer, String> convertListToMap = employeeList1.stream()
				.collect(Collectors.toMap(EmployeeDto::getEmployeeId, EmployeeDto::getEmployeeName));
		Map<Integer, String> convertListToMap1 = employeeList1.stream()
				.sorted(Comparator.comparing(EmployeeDto::getEmployeeId))
				.collect(Collectors.toMap(EmployeeDto::getEmployeeId, EmployeeDto::getEmployeeName));
		System.out.println("Convert List To Map : " + convertListToMap);

		// find the employee with lowest age
		System.out.println("Find the employee with highest age *****************");
		Optional<Employee> youngAge = employeeList2.stream().min(Comparator.comparing(Employee::getAge));
		System.out.println("Young Age : " + youngAge);
	}
}
