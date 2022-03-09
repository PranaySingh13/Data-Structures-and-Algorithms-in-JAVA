package oops.interfaces.defaultMethod;

/*In case both the implemented interfaces contain default
 *methods with same method signature, the implementing class
 * should explicitly specify which default method is to be 
 * used or it should override the default method.*/

//multiple inheritance through default methods.

interface Test1 {

	// Default method
	default void show() {
		System.out.println("Default Test1");
	}
}

interface Test2 {

	// Default method
	default void show() {
		System.out.println("Default Test2");
	}
}

public class TestMultipleInheritance implements Test1, Test2 {

	// Overriding default show method
	@Override
	public void show() {

		// use super keyword to call the show
		// method of TestInterface1 interface
		Test1.super.show();

		// use super keyword to call the show
		// method of TestInterface2 interface
		Test2.super.show();
	}

	public static void main(String args[]) {
		TestMultipleInheritance d = new TestMultipleInheritance();
		d.show();
	}

}
