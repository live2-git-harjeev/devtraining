package com.live.java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		objectInstanceMethodReference();
	}

	private static void objectInstanceMethodReference() {
		// :: the method reference operator
		// stores elements in insertion order
		// it allows duplicates
		List<String> namesList = new ArrayList<String>();
		namesList.add("Tony");
		namesList.add("Robbins");

		// Iterate the java 8 way
		// DIGGING INTO THE SOURCE CODE
//	@FunctionalInterface
//	public interface Consumer<T>
// 	void accept(T t)

//	void accept(String item)	{
//		System.out.println(item);
//	}
		namesList.forEach(item -> System.out.println(item));

		// Iterate the java 8 way
		namesList.forEach(item -> {
			if (item.length() > 4)
				System.out.println("Condition : " + item);
		});
		// Filtering the results

		// Iterating an array with method reference
		namesList.forEach(System.out::println);
//	    default void forEach(Consumer<? super T> action) {
//	        Objects.requireNonNull(action);
//	        for (T t : this) {
//	            action.accept(t);
//	        }
//	    }
	}
}
