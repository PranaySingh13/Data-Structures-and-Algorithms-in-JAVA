package oops.interfaces;

/*The interface in Java is a mechanism to achieve abstraction. 
There can be only abstract methods in the Java interface, 
not method body before JAVA 8. 

It cannot be instantiated just like the abstract class.

Since Java 8, we can have default and static methods in an interface.

Since Java 9, we can have private methods in an interface.

The Java compiler adds public and abstract keywords before the 
interface method. Moreover, it adds public, static and final keywords 
before data members.*/

interface Printable {
	void print();
}

interface Showable extends Printable {
	void show();
}

public class Test implements Showable {

	@Override
	public void print() {
		System.out.println("Hello");

	}

	@Override
	public void show() {
		System.out.println("Welcome");

	}

	public static void main(String[] args) {
		Test t = new Test();
		t.print();
		t.show();

	}

}
