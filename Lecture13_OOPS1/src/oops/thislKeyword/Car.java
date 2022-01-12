package oops.thislKeyword;

public class Car {

	String name;
	int topSpeed;

	public Car(String name, int topSpeed) {
		System.out.println("This Contains reference of the current class: " + this);
		this.name = name;
		this.topSpeed = topSpeed;
	}

}
