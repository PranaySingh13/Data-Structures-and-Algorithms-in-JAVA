package oops.interfaces;

/*Since Java 8, we can have method body in interface. 
 *But we need to make it default method.*/
interface Drawable {
	void draw();

	default void msg() {
		System.out.println("default method");
	}
}

class Rectangle implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

public class Java8_Default_Method_in_Interface {

	public static void main(String[] args) {
		Drawable d = new Rectangle();
		d.draw();
		d.msg();
	}

}
