package java8.newfeatures;

public class CustomFunctionalInterface {
	public static void main(String[] args) {
		Integer[] intArray = { 5, 6, 7, 8 };
		// using a static method reference
		Counter counter = Utils::countElements;
		System.out.println(counter.count(intArray));
		// using instance method reference
		Utils utilsInstance = new Utils();
		Counter counter2 = utilsInstance::countElementsInstance;
		System.out.println(counter2.count(intArray));
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