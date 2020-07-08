package com.live.java8;

import java.util.ArrayList;

public class OptionalDemo {
	static String testString;

	public static void main(String[] args) {
		Person person = null;
		ArrayList arrayList = null;
		Integer numbers[] = null;

		if (Math.random() > 0.5) {
			numbers = new Integer[3];
			numbers[0] = 100;
			testString = "Welcome";
			person = new Person();
			arrayList = new ArrayList();
			arrayList.add("smile");
		}

		System.out.println(testString.length());
	}
}

class Person {
	private String name = "Tester";

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}