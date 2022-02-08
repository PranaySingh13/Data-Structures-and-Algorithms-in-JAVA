package oops.inheritance;

//Employee is the superclass.
class Employee {
	float salary = 100000;
}

//Programmer is the subclass
//The relationship between the two classes is Programmer IS-A Employee.
class Programmer extends Employee {
	int bonus = 20000;

	void display() {
		System.out.println("Programmer salary is: " + salary);
		System.out.println("Programmer bonus is: " + bonus);
	}
}

/*
 * Single Inheritance Example When a class inherits another class, it is known
 * as a single inheritance.
 */
class Animal {
	void eat() {
		System.out.println("Eating");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Barking");
	}
}

/*
 * Multilevel Inheritance Example When there is a chain of inheritance, it is
 * known as multilevel inheritance.
 */

class Animal1 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("barking...");
	}
}

class BabyDog extends Dog1 {
	void weep() {
		System.out.println("weeping...");
	}
}

/*
 * Hierarchical Inheritance Example When two or more classes inherits a single
 * class, it is known as hierarchical inheritance.
 */
class Animal2 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog2 extends Animal2 {
	void bark() {
		System.out.println("barking...");
	}
}

class Cat extends Animal2 {
	void meow() {
		System.out.println("meowing...");
	}
}

/*
 * Why multiple inheritance is not supported in java? To reduce the complexity
 * and simplify the language, multiple inheritance is not supported in java.
 */
class A {
	void msg() {
		System.out.println("Hello");
	}
}

class B {
	void msg() {
		System.out.println("Welcome");
	}
}

/*
 * The C class inherits A and B classes. If A and B classes have the same method
 * and you call it from child class object, there will be ambiguity to call the
 * method of A or B class.
 */
//class c extends A,B{	}

public class isARelationship {

	public static void main(String[] args) {
		/*
		 * Inheritance in Java is a mechanism in which one object acquires all the
		 * properties and behaviors of a parent object. It is an important part of OOPs
		 * (Object Oriented programming system).
		 */

		/*
		 * Inheritance represents the IS-A relationship which is also known as a
		 * parent-child relationship.
		 */

		/*
		 * Why use inheritance in java
		 * 
		 * For Method Overriding (so runtime polymorphism can be achieved).
		 * 
		 * For Code Reusability.
		 * 
		 * Terms used in Inheritance
		 * 
		 * Class: A class is a group of objects which have common properties. It is a
		 * template or blueprint from which objects are created.
		 * 
		 * Sub Class/Child Class: Subclass is a class which inherits the other class. It
		 * is also called a derived class, extended class, or child class. Super
		 * Class/Parent Class:
		 * 
		 * Superclass: is the class from where a subclass inherits the features. It is
		 * also called a base class or a parent class.
		 * 
		 * Reusability: As the name specifies, reusability is a mechanism which
		 * facilitates you to reuse the fields and methods of the existing class when
		 * you create a new class.
		 */

		Programmer p = new Programmer();
		p.display();

		/*
		 * Types of inheritance in java
		 * 
		 * On the basis of class, there can be three types of inheritance in java:
		 * single, multilevel and hierarchical.
		 * 
		 * In java programming, multiple and hybrid inheritance is supported through
		 * interface only.
		 */

		Dog d = new Dog();
		d.bark();
		d.eat();

		BabyDog bd = new BabyDog();
		bd.weep();
		bd.bark();
		bd.eat();

		Cat c = new Cat();
		c.meow();
		c.eat();
		// c.bark(); //The method bark() is undefined for the type Cat

	}

}
