package oops.superKeyword;

/*Usage of Java super Keyword

super can be used to refer immediate parent class instance variable.
super can be used to invoke immediate parent class method.
super() can be used to invoke immediate parent class constructor.
*/

class Animal {

	String color = "White";

	void eat() {
		System.out.println("eating...");
	}

	public Animal() {
		System.out.println("Animal is Created");
	}
}

class Dog extends Animal {

	String color = "black";

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
	}

	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();
		bark();
	}

	public Dog() {
		super();
		System.out.println("Dog is Created");
	}
}

/*
 * Note: super() is added in each class constructor automatically by compiler if
 * there is no super() or this().
 */

class Cat extends Animal {
	public Cat() {
		System.out.println("Cat is Created");
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.work();
		d.printColor();

		Cat c = new Cat();
	}

}