package oops.polymorphism;

/*Polymorphism in Java 

Polymorphism in Java is a concept by which we can perform a single action in different ways. 
Polymorphism is derived from 2 Greek words: poly and morphs. 
The word "poly" means many and "morphs" means forms. So polymorphism means many forms.
There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. 
We can perform polymorphism in java by method overloading and method overriding.
*/

//1) Method Overloading: changing no. of arguments
/*In this example, we are creating static methods
so that we don't need to create instance for calling methods.*/
class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

//2) Method Overloading: changing data type of arguments
class Multiplier {
	static int multiply(int a, int b) {
		return a * b;
	}

	static double multiply(double a, double b) {
		return a * b;
	}
}

/*
 * Q) Why Method Overloading is not possible by changing the return type of
 * method only?
 * 
 * In java, method overloading is not possible by changing the return type of
 * the method only because of ambiguity.
 */
class Adder1 {
	static int add(int a, int b) {
		return a + b;
	}

//	static double add(int a, int b) {
//		return a + b;
//	}
}

/*
 * If a class has multiple methods having same name but different in parameters,
 * it is known as Method Overloading.
 */
public class MethodOverloading {

	public static void main(String[] args) {
		/*
		 * Advantage of method overloading
		 * 
		 * Method overloading increases the readability of the program.
		 * 
		 * Different ways to overload the method There are two ways to overload the
		 * method in java
		 * 
		 * By changing number of arguments
		 * 
		 * By changing the data type
		 * 
		 * In Java, Method Overloading is not possible by changing the return type of
		 * the method only.
		 */

		System.out.println(Adder.add(4, 5));// 9
		System.out.println(Adder.add(1, 2, 3));// 6

		System.out.println(Multiplier.multiply(4, 5));// 20
		System.out.println(Multiplier.multiply(1.1, 2.2));// 2.4200000000000004

		System.out.println(Adder1.add(4, 5));// ambiguity

		/*
		 * Can we overload java main() method?
		 * 
		 * Yes, by method overloading. You can have any number of main methods in a
		 * class by method overloading. But JVM calls main() method which receives
		 * string array as arguments only.
		 */
		System.out.println("Main function with String[]");
	}

	// It is overloaded but it is not called by JVM.
	public static void main() {
		System.out.println("Main Function Without Args");
	}

}
