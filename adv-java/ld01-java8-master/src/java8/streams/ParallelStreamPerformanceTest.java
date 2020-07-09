package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamPerformanceTest {
	public static void main(String[] args) {
		long stime = sequentialStream();
		long ptime = parallelStream();
		System.out.println(stime);
		System.out.println(ptime);
		System.out.println("Parallel stread reduced " + (stime - ptime) + " nano seconds!");
	}

	private static long sequentialStream() {
		// create the source list
		List<Integer> productList = new ArrayList<Integer>();

		productList.add(1000);
		for (int i = 0; i < 100; i++) {
			int lastValue = productList.get(i);
			productList.add(lastValue + 1000);
		}
		System.out.println("BEFORE PROCESSING " + productList);
		// System.out.println("Input List ---> " + productList);

		// Returns a sequential Stream with this collection as its source.
		// productList.stream().filter(element -> (element > 5000 && element <
		// 10000)).forEach(System.out::println);

		// List to collect the filtered items.
		List serialList = new ArrayList();
		long started = System.nanoTime();
		productList.stream().filter(element -> (element > 5000 && element < 10000)).forEach((element) -> {
			System.out.println("seqential > " + Thread.currentThread().getName() + " > " + element);
			serialList.add(element);

		});
		long finished = System.nanoTime();
		long timeElapsed = finished - started;
		System.out.println("Serial List ---> " + serialList);
		System.out.println("Sequential : " + timeElapsed);
		System.out.println("AFTER PROCESSING " + productList);
		return timeElapsed;
	}

	private static long parallelStream() {
		// create the source list
		List<Integer> productList = new ArrayList<Integer>();

		productList.add(1000);
		for (int i = 0; i < 100; i++) {
			int lastValue = productList.get(i);
			productList.add(lastValue + 1000);
		}
		System.out.println("BEFORE PROCESSING " + productList);
		// System.out.println("Input List ---> " + productList);

		// Returns a parallel Stream with this collection as its source.
		// productList.parallelStream().filter(element -> (element > 5000 && element <
		// 10000)).forEach(System.out::println);

		// List to collect the filtered items.
		List parallelList = new ArrayList();
		long started = System.nanoTime();
		productList.parallelStream().filter(element -> (element > 5000 && element < 10000)).forEach((element) -> {
			System.out.println("parallel > " + Thread.currentThread().getName() + " > " + element);
			parallelList.add(element);

		});
		long finished = System.nanoTime();
		long timeElapsed = finished - started;
		System.out.println("Serial List ---> " + parallelList);
		System.out.println("Sequential : " + timeElapsed);
		System.out.println("AFTER PROCESSING " + productList);
		return timeElapsed;
	}

}
