:beginner: **lab exercises**

:lock: store the values 1, 5.5f,'a', true in the same array and print them.

:lock:  store the values 1, 5.5f,'a', true in a hashmap and print them.


:lock: analyze the program below and apply instance method reference for method (countElementsInstance).
```java
package com.live.java8;

public class CustomFunctionalInterface {
	public static void main(String[] args) {
		Integer[] intArray = { 5, 6, 7, 8 };
		// using a static method reference
		Counter counter = Utils::countElements;
		System.out.println(counter.count(intArray));
	}
}

@FunctionalInterface
interface Counter {
	int count(Object[] objArray);
	// public abstract int count(Object[] objArray);
//	int count(Object[] objArray) {
//		int count = Utils.countElement(objArray);
//		return count;
//	}
}

class Utils {
	public static int countElements(Object[] array) {
		return array.length;
	}

	public int countElementsInstance(Object[] array) {
		return array.length;
	}
}
```
:lock: modify the code to avoid null pointer exceptions using Optional
  
```java
package com.live.java8;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalDemo {
	static String testString = null;

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

		Optional optionalString = Optional.ofNullable(testString);
		if (optionalString.isPresent()) {
			System.out.println(testString.length());
			int length = optionalString.get().toString().length();
			System.out.println(length);
		} else {
			System.out.println("String may be null!");
		}

	}
}

class Person {
	private String name = "Tester";

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}
```
