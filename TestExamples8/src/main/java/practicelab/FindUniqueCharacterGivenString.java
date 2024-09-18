package practicelab;

import java.util.Scanner;
import java.util.stream.Collectors;

public class FindUniqueCharacterGivenString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		// The chars() method converts the string into a stream of characters.
		// The mapToObj(c -> (char) c) converts the stream of integers (representing
		// characters) to a stream of characters.
		// The distinct() method removes duplicate characters.
		// The collect(Collectors.joining()) joins the characters back into a string.
		String uniqueChars = string.chars().mapToObj(c -> (char) c).distinct().map(String::valueOf)
				.collect(Collectors.joining());

		System.out.println("Unique characters: " + uniqueChars);
		scanner.close();
	}
}
