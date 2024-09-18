package practicelab;

public class Print1To10WithoutAnyLoop {

	public static void number(int n) {
		if (n > 10) {
			return;

		}
		System.out.println(n);
		number(n + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// in java 8 one line
		// IntStream.rangeClosed(1, 10).forEach(System.out::println);
		number(1);
	}

}
