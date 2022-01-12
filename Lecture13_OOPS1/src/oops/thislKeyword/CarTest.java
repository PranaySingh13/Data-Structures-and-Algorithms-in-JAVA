package oops.thislKeyword;

public class CarTest {

	public static void main(String[] args) {

		Car c1 = new Car("Audi", 400);
		System.out.println("Reference in c1 Car object reference: " + c1);
		System.out.println(c1.name + " " + c1.topSpeed);

		/*
		 * c1 cand this refers to the same reference of the current class
		 */

	}

}
