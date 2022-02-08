package oops.constructors;

class Bike {

	// Default Constructor(when it doesn't have any parameter.)
	public Bike() {
		System.out.println("Bike is created");
	}
}

class Car {

	String color;
	int year;

	// Parameterized Constructors(A constructor which has a specific number of
	// parameters)
	public Car(String c) {
		this.color = c;
		System.out.println("Car is " + c + " in color");
	}

	public Car(String c, int y) {
		this.color = c;
		this.year = y;
		System.out.println("Car is " + c + " in color and launched in " + y);
	}
}

public class ConstructorUse {

	public static void main(String[] args) {
		/*
		 * In Java , a constructor is a block of codes similar to the method. It is
		 * called when an instance of the class is created. At the time of calling
		 * constructor, memory for the object is allocated in the memory.
		 * 
		 * It is a special type of method which is used to initialize the object.
		 * 
		 * Every time an object is created using the new() keyword, at least one
		 * constructor is called.
		 * 
		 * It calls a default constructor if there is no constructor available in the
		 * class. In such case, Java compiler provides a default constructor by default.
		 */

		/*
		 * Note: It is called constructor because it constructs the values at the time
		 * of object creation. It is not necessary to write a constructor for a class.
		 * It is because java compiler creates a default constructor if your class
		 * doesn't have any.
		 */

		/*
		 * Rules for creating Java constructor There are two rules defined for the
		 * constructor.
		 * 
		 * Constructor name must be the same as its class name A Constructor must have
		 * no explicit return type A Java constructor cannot be abstract, static, final,
		 * and synchronized
		 * 
		 * Note: We can use access modifiers while declaring a constructor. It controls
		 * the object creation. In other words, we can have private, protected, public
		 * or default constructor in Java.
		 */

		Bike b = new Bike();// Bike is created
		Car c1 = new Car("Black");// Car is Black in color

		/*
		 * Constructor overloading in Java is a technique of having more than one
		 * constructor with different parameter lists. They are arranged in a way that
		 * each constructor performs a different task. They are differentiated by the
		 * compiler by the number of parameters in the list and their types.
		 */
		Car c2 = new Car("Red", 2022);// Car is Red in color and launched in 2022

	}

}
