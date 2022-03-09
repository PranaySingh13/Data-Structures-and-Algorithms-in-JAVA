package oops.generics;

//We use < > to specify Parameter type
class Test1<T, U> {
	T obj1; // An object of type T
	U obj2; // An object of type U

	// constructor
	Test1(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	// To print objects of T and U
	public T getObj1() {
		return obj1;
	}

	public U getObj2() {
		return obj2;
	}
}

public class Multiple_Type_Generic {

	public static void main(String[] args) {

		// Datatype can be same
		Test1<String, String> t1 = new Test1<>("Pranay", "Singh");
		System.out.println(t1.getObj1());
		System.out.println(t1.getObj2());

		// Datatype can be different
		Test1<String, Integer> t2 = new Test1<>("Pranay", 28);
		System.out.println(t2.getObj1());
		System.out.println(t2.getObj2());

		Test1<String, String> internalTest = new Test1<>("Pranay", "Singh");

		// User-Defined Datatype
		Test1<Test1<String, String>, Integer> outerTest = new Test1<>(internalTest, 28);
		System.out.println(
				outerTest.getObj1().getObj1() + " " + "" + outerTest.getObj1().getObj2() + " " + outerTest.getObj2());
		// Pranay Singh 28
	}

}
