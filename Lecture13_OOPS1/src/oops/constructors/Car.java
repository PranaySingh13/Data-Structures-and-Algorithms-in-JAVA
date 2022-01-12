package oops.constructors;

public class Car {

	String carName;
	int carTopSpeed;

	/*
	 * the default constructor is available only till the point we don’t create our
	 * own constructor.once the Parameterized Constructor is created manually we
	 * need to create default constructor
	 */
	// Default Constructor
	public Car() {
	}

	public Car(String name) {
		carName = name;
	}

	// Parameterized Constructor
	public Car(String name, int speed) {
		carName = name;
		carTopSpeed = speed;
	}

}
