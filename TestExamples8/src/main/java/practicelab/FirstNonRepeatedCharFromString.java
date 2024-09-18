package practicelab;

public class FirstNonRepeatedCharFromString {

	public static void main(String[] args) {
		String string = "badcbadc";
		for (Character ch : string.toCharArray()) {
			if (string.indexOf(ch) == string.lastIndexOf(ch)) {
				System.out.println("First non repeated character is : " + ch);
				break;
			}
		}
		System.out.println("There is no first non repeated character");
	}
}
