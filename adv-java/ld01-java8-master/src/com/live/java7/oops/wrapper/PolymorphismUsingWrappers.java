package com.live.java7.oops.wrapper;

public class PolymorphismUsingWrappers {
	public static void main(String[] args) {
		int i = 100;
		float f = 500.50f;

		Number numbers[] = new Number[2];
		// boxed and upcasted
		// specific object is stored in a generic array
		numbers[0] = new Integer(i);
		numbers[1] = new Float(f);

		for (Number number : numbers) {
			System.out.println(number);
		}

		// storing user defined + wrappers in the same object array.
		Object object[] = new Object[2];
		object[0] = numbers;
		object[1] = new TestClass();
	}
}

class TestClass {

}