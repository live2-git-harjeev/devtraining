package java7.fundamentals;

public class ShallowClone {
public static void main(String[] args) {

}
}

class ObjectToBeCloned {
	// THE INT ARRAY IS SHALLOW CLONED AS ONLY THE ADDRESS IS COPIED AND THE VALUES
	// ARE NOT COPIED
	public int[] numbers;
	public String nameString = "Rambo";
	public float value = 5.5f;
	public Float floatWrapper = 55.55f;
	public Test test = new Test();

	public ObjectToBeCloned(int size) {
		numbers = new int[size];
	}
	
	static void cloneTest() {
		ObjectToBeCloned originalObject = new ObjectToBeCloned(2);
		originalObject.numbers[0] = 100;
	}
}
class Test {
	String nameString = "Tester";

	@Override
	public String toString() {
		return "Test [nameString=" + nameString + "]";
	}

}