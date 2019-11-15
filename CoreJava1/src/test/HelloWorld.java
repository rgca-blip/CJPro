package test;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

	public static void main(String[] args) {

		Hello hl = new Hello("anil", 78);
		Hello hl1 = new Hello("alekha", 66);
		Hello hl2 = new Hello("amit", 23);
		Hello hl3 = new Hello("anil", 78);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello World!");
		}
		Map<Object, String> hm = new HashMap<>();
		hm.put(hl, "Asurabandha");
		hm.put(hl1, "Gangapure");
		hm.put(hl2, "Mayurabhanja");
		hm.put(hl3, "Sorada");
		System.out.println(hm.toString());
	}

}
