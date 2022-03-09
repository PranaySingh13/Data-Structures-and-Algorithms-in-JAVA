package oops.generics;

//We use < > to specify Parameter type
class GenericTest<T> {

	// An object of type T is declared
	T object;

	// constructor
	public GenericTest(T obj) {
		this.object = obj;
	}

	// getters and setters
	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

}

public class Generic {
	public static void main(String[] args) {

		GenericTest<Integer> gt = new GenericTest<Integer>(100);
		System.out.println(gt.getObject());// 100
		gt.setObject(10);
		System.out.println(gt.getObject());// 10

		// For Higher version from Java8 mentioning datatype with new is not mandatory.
		GenericTest<String> gt1 = new GenericTest<>("Pranay");
		System.out.println(gt1.getObject());// Pranay
		gt1.setObject("Singh");
		System.out.println(gt1.getObject());// Singh
	}
}
