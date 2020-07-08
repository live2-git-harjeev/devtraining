package com.live.java8;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalDemo {
//	static String testString = "";
//	static String testString = null;
	static String testString; // the default constructor assigns the value to null.

	public static void main(String[] args) {
		if (testString == null) {
			System.out.println("null string");
		} else {
			System.out.println("Not null");
		}
		Person person = null;
		ArrayList arrayList = null;
		Integer numbers[] = null;

		if (Math.random() > 0.5) {
			numbers = new Integer[3];
			numbers[0] = 100;
			testString = "";
			// testString = "Welcome";
			person = new Person();
			arrayList = new ArrayList();
			arrayList.add("smile");
		}

		Optional optionalString = Optional.ofNullable(testString);
		if (optionalString.isPresent()) {
			System.out.println(testString.length());
			int length = optionalString.get().toString().length();
			System.out.println(length);
		} else {
			System.out.println("String may be null!");
		}
		Optional optionalIntegerArray = Optional.ofNullable(numbers);
		if (optionalIntegerArray.isPresent()) {
			Integer[] tempArrayIntegers = (Integer[]) optionalIntegerArray.get();
			System.out.println(tempArrayIntegers[0]);
		}
		Optional optionalArrayList = Optional.ofNullable(arrayList);
		// Optional optionalString = Optional.ofNullable(testString);
		Optional optionalObject = Optional.ofNullable(person);

		if (optionalArrayList.isPresent()) {
			System.out.println(optionalArrayList.get());
		} else
			System.out.println("No ArrayList");
		if (optionalString.isPresent()) {
			System.out.println(testString.length());
		} else
			System.out.println("No String or Null String");

		if (optionalObject.isPresent()) {
			System.out.println(optionalObject.get());
		} else
			System.out.println("No Object");
	}
}

class Person {
	private String name = "Tester";

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}