package oops.interfaces;

/*Since Java 8, we can have method body in interface. 
 *But we need to make it static method.*/
interface Drawable1 {
	void draw();

	static int cube(int x) {
		return x * x * x;
	}
}

class Rectangle1 implements Drawable1 {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

public class Java8_Static_Method_in_Interface {

	public static void main(String[] args) {
		Drawable1 d = new Rectangle1();
		d.draw();

		// static methods can directly called with class names we dont need an object of
		// a class for calling.
		System.out.println(Drawable1.cube(3));

	}

}
