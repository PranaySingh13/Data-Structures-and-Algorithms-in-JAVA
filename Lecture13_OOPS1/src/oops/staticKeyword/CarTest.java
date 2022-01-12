package oops.staticKeyword;

public class CarTest {

	public static void main(String[] args) {

		Car c = new Car();
		Car.year = 2022;
		c.name = "Audi";

		Car d = new Car();
		System.out.println(d.year);

		Car.year = 2024;
		Car e = new Car();
		System.out.println(e.year);

		/*
		 * Now in this code, when we look carefully, even when the new instance of Car
		 * is created, the year is defined by the first instance of the Car and it tends
		 * to remain the same for all instances of the object. But here’s the catch, we
		 * can change the value of this static variable from any instance. Here the
		 * output will be 2022 for every instance as long as it is not changed.
		 */

		Car.fun();
		System.out.println(Car.a + Car.b);
		/*
		 * When t.fun() is called, it will simply change the value of b to 40. Therefore
		 * the output of this code will be 50.
		 */

	}

}
