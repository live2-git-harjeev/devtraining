package java7.fundamentals;

public class ShallowClone {
public static void main(String[] args) {

}
}

class ObjectToBeCloned implements Cloneable {
	// THE INT ARRAY IS SHALLOW CLONED AS ONLY THE ADDRESS IS COPIED AND THE VALUES
	// ARE NOT COPIED
	public int[] numbers;
	public String nameString = "Rambo";
	public float value = 5.5f;
	public Float floatWrapper = 55.55f;
	public Test test = new Test();

	public static void cloneTest() {
		
	}
}
class Test {
	String nameString = "Tester";

	@Override
	public String toString() {
		return "Test [nameString=" + nameString + "]";
	}

}