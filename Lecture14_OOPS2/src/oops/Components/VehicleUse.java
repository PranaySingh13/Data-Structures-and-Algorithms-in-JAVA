package oops.Components;

public class VehicleUse {

	public static void main(String[] args) {

		Vehicle v = new Vehicle();
		v.print();// null 0

		v.setColor("Black");
		v.setMaxSpeed(200);
		v.print();// Black 200

		Car c = new Car();
		c.setColor("Red");
		c.setMaxSpeed(240);
		c.setNumGears(6);
		c.setConvertible(true);

		c.printCar();// Red 240 6 true
		c.print();// Red 240

		Vehicle v1 = new Car();
		v1.setColor("White");
		v1.setMaxSpeed(300);

		/*
		 * As this properties are of child class Car so they not accessible by parent
		 * Class Vehicle.
		 */
		// v1.setNumGears(5);
		// v1.setConvertible(true);
		// v1.printCar();
		v1.print();
	}

}
