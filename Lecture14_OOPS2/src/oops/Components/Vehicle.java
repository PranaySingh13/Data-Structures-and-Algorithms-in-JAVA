package oops.Components;

//Encapsulation
public class Vehicle {

	// Data Hiding
	private String color;
	private int maxSpeed;

	// Abstraction
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void print() {
		System.out.println(color + " " + maxSpeed);
	}

}
