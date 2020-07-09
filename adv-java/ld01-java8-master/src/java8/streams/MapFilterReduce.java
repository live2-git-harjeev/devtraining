package java8.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapFilterReduce {

	public static void main(String[] args) {
		// mapping_operation();
		// filter_operation();
		reduction_operation();
	}

	private static void reduction_operation() {
		// traditonal way of doing the reduction operation....
		int playersSalary1[] = { 70000, 100, 20000 };
//		int sum = 0;
//		for (int i = 0; i < playersSalary1.length; i++) {
//			sum = sum + playersSalary1[i];
//		}
//		System.out.println(sum);

//A sequence of primitive int-valued elements supporting sequential and parallel aggregate operations. This is the int primitive specialization of Stream.
		IntStream playerStream = Arrays.stream(playersSalary1);
		int sum = playerStream.sum();
		System.out.println(sum);

		System.out.println(Arrays.stream(playersSalary1).max());
		System.out.println(Arrays.stream(playersSalary1).min());
		System.out.println(Arrays.stream(playersSalary1).count());
	}

	private static void mapping_operation() {
		// A simple array
		String[] players = new String[] { "sam", "peter", "billy", "lilly" };
		// establishing a stream from an array
		Stream<String> playerStream = Arrays.stream(players);
		// Returns a stream consisting of the results of applying the given function to
		// the elements of this stream.
		// Map takes each element, modifies them (using lambda expression [Function])
		// and returns the modified data
		Stream<String> upperCaseStream = playerStream.map(player -> player.toUpperCase());
		// Convert the stream back to an array
		String[] mappedPlayers = upperCaseStream.toArray(String[]::new);
		for (String string : mappedPlayers) {
			System.out.println(string);
		}
	}

	private static void filter_operation() {
		// A simple array
		String[] players = new String[] { "sam", "peter", "billy", "lilly" };
		// A stream is a sequence of elements supporting sequential and parallel
		// aggregate operations.
		Stream<String> playerStream = Arrays.stream(players);
		// Provides a subset based on a condition
		Stream<String> filteredStream = playerStream.filter(player -> player.length() > 3);
		// Converting the stream to array.
		String[] newPlayers = filteredStream.toArray(String[]::new);

		for (Object playerObject : newPlayers) {
			System.out.println(playerObject);
		}
	}

}
