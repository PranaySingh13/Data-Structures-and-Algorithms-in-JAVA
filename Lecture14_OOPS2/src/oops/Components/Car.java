package oops.Components;

//Inheritance
public class Car extends Vehicle {

	private int numGears;
	private boolean isConvertible;

	public int getNumGears() {
		return numGears;
	}

	public void setNumGears(int numGears) {
		this.numGears = numGears;
	}

	public boolean isConvertible() {
		return isConvertible;
	}

	public void setConvertible(boolean isConvertible) {
		this.isConvertible = isConvertible;
	}

	public void printCar() {
		System.out.println(getColor() + " " + getMaxSpeed() + " " + numGears + " " + isConvertible);
	}

}
