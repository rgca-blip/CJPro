package practicelab;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertFirstCharaterUpperCaseFromEachString {
	public static void main(String[] args) {
		String text = "jai shree ram";
		String result = Arrays.stream(text.split(" "))
				.map(word -> word.substring(0, 1).toUpperCase() + word.substring(1)).collect(Collectors.joining(" "));
		System.out.println(result);
		// springsecirity
		// tranjection
		// aop
		// cache
		// junit
	}
	public static String convertString(String str) {
        String[] words = str.split(" ");
	        StringBuilder result = new StringBuilder();
	        for (String word : words) {
	            if (word.isEmpty() || (word.length() == 1 && Character.isDigit(word.charAt(0)))) {
	                result.append(word).append(" ");
	                continue;
	            }
	            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
	            result.append(capitalizedWord).append(" ");
	        }
	        return result.toString().trim();
     }
}
