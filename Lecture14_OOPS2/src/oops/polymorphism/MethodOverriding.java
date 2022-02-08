package oops.polymorphism;

//Creating a parent class.  
class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

//Creating child classes.  
class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}

/*
 * If subclass (child class) has the same method as declared in the parent
 * class, it is known as method overriding in Java.
 */
public class MethodOverriding {

	public static void main(String[] args) {
		/*
		 * Usage of Java Method Overriding
		 * 
		 * Method overriding is used to provide the specific implementation of a method
		 * which is already provided by its superclass.
		 * 
		 * Method overriding is used for runtime polymorphism
		 * 
		 * Rules for Java Method Overriding
		 * 
		 * The method must have the same name as in the parent class.
		 * 
		 * The method must have the same parameter as in the parent class.
		 * 
		 * There must be an IS-A relationship (inheritance).
		 */

		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();

		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());

		/*
		 * Why can we not override static method?
		 * 
		 * It is because the static method is bound with class whereas instance method
		 * is bound with an object. Static belongs to the class area, and an instance
		 * belongs to the heap area.
		 * 
		 * Can we override java main method?
		 * 
		 * No, because the main is a static method.
		 */
	}

}
