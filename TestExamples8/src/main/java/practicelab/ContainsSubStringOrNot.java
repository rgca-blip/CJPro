package practicelab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContainsSubStringOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Find The", "Common", "Element Of", "TwoString");
		String subString = "The";
		List<String> sub = names.stream().filter(name -> name.contains(subString)).collect(Collectors.toList());
		List<String> nam = names.stream().filter(n -> n.contains(subString)).collect(Collectors.toList());
		System.out.println(nam);
		System.out.println(sub);
	}

}
