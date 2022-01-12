package oops.constructors;

public class CarTest {

	public static void main(String[] args) {

		Car c1 = new Car();// It will call default constructor.
		System.out.println(c1.carName + " " + c1.carTopSpeed);

		Car c2 = new Car("Audi");// It will call parameterized constructor having one argument.
		System.out.println(c2.carName + " " + c2.carTopSpeed);

		Car c3 = new Car("Ferrari", 400);// It will call parameterized constructor having two argument.
		System.out.println(c3.carName + " " + c3.carTopSpeed);

	}

}
