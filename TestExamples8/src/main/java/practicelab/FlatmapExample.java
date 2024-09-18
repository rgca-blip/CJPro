package practicelab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Persion {
	private String name;
	private List<String> phoneNo;

	public Persion(String name, List<String> phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}

}

public class FlatmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persion> persions = Arrays.asList(new Persion("ram", Arrays.asList("1365479055", "7896541230")),
				new Persion("ram", Arrays.asList("1365479055", "7896541230")),
				new Persion("ram", Arrays.asList("1365479055", "7896541230")));
		List<String> num = persions.stream().flatMap(persion -> persion.getPhoneNo().stream())
				.collect(Collectors.toList());
		System.out.println(num);
	}

}
