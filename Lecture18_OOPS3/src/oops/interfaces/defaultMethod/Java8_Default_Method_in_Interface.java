package oops.interfaces.defaultMethod;

/*Since Java 8, we can have method body in interface. 
 *But we need to make it default method.*/

/*Before Java 8, interfaces could have only abstract methods.
 *The implementation of these methods has to be provided in a
 * separate class. So, if a new method is to be added in an 
 * interface, then its implementation code has to be provided
 * in the class implementing the same interface. To overcome 
 * this issue, Java 8 has introduced the concept of default 
 * methods which allow the interfaces to have methods with
 * implementation without affecting the classes that implement 
 * the interface.
 * 
 * 
 * Default methods were introduced to provide backward compatibility
 * for old interfaces so that they can have new methods without affecting 
 * existing code.*/

//A simple program to Test Interface default
//methods in java
interface TestInterface {
	// abstract method
	public void square(int a);

	// default method
	default void show() {
		System.out.println("Default Method Executed");
	}
}

class Java8_Default_Method_in_Interface implements TestInterface {
	// implementation of square abstract method
	public void square(int a) {
		System.out.println(a * a);
	}

	public static void main(String args[]) {
		Java8_Default_Method_in_Interface d = new Java8_Default_Method_in_Interface();
		d.square(10);

		// default method executed
		d.show();
	}
}