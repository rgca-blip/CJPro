package com.rgsoftware.BasicExaples;

public class ConvertStringToCharAndCharToString {

	public static void main(String[] args) {
		String name="byashadev";
		char[] ch=name.toCharArray();
		System.out.println(ch);
		char na='h';
		String s=Character.toString(na);
		System.out.println(s);
	}

}
