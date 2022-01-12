package oops.staticKeyword;

public class Car {

	/*
	 * Static Keyword
	 * 
	 * The static variable gets memory only once in the class area at the time of
	 * class loading.
	 * 
	 * The static keyword in Java is used for memory management mainly. We can apply
	 * static keyword with variables , methods, blocks and nested classes . The
	 * static keyword belongs to the class rather than an instance of the class.
	 * 
	 * static keyword is bound to the class and not to an individual object, thus we
	 * can’t make constructors static.
	 */

	/*
	 * Static Functions
	 * 
	 * If you apply a static keyword with any method, it is known as static method.
	 * 
	 * A static method belongs to the class rather than the object of a class.
	 * 
	 * A static method can be invoked without the need for creating an instance of a
	 * class.
	 * 
	 * A static method can access static data members and can change the value of
	 * it.
	 */
	static int year;
	String name;

	static int a = 10;
	static int b;

	static void fun() {
		b = a * 4;
	}

}
