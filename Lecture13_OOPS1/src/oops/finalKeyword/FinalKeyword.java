package oops.finalKeyword;

/*
1) Java final variable
If you make any variable as final, you cannot change the value of final variable(It will be constant).
*/

/*
2) Java final method
If you make any method as final, you cannot override it.
*/

/*
3) Java final class
If you make any class as final, you cannot extend it.
*/

class Pen {

	final int price = 15;

	final String color;// blank final variable

	Pen() {
		this.color = "Red";// we can initialize blank final variable but only in constructor.
	}

	final void run() {
		System.out.println("writing");
	}
}

//final class Pencil{
//	
//}

public class FinalKeyword extends Pen {

//	void run() {
//		System.out.println("writing safely ");
//	}

	public static void main(String[] args) {
		Pen p = new Pen();
		// p.price=20; // Compilation Error as price is final
		System.out.println(p.price);

		// final method is inherited but you cannot override it.
		p.run();
		System.out.println(p.color);
	}

}
