package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamPerformanceTest {
	public static void main(String[] args) {

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
		System.out.println("Input List ---> " + productList);

		List serialList = new ArrayList();
		return 0;
	}

//	private static long parallelStream() {
//		return null;
//	}
}
