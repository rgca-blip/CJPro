package cbmiaq;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AltimetrikQFindDuplicateNumber {
	public static void main(String[] args) {
		List<Integer> number = List.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		Set<Integer> set = new HashSet<>();
		//number.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		List<String> string = List.of("5", "13", "4", "21", "13", "27", "2", "59", "59", "34");
		Set<String> set1 = new HashSet<>();
		string.stream().filter(s -> !set1.add(s)).forEach(System.out::println);
		
		//get employee details which working on department "HR".
		//employees.stream().filter(employee->"HR".equals(employee.getDepartment)).collect(Collectors.toList());

	}
}