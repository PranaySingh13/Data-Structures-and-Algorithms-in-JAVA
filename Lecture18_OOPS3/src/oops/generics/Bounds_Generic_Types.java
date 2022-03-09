package oops.generics;

interface D {

	void doRun();
}

class A implements D {

	public void doRun() {
		System.out.println("Inside Super Class A");
	}
}

class B extends A {

	public void doRun() {
		System.out.println("Inside Sub Class B");
	}
}

class C extends A {

	public void doRun() {
		System.out.println("Inside Sub Class C");
	}
}

//Bounded Generic Class Test2 which is bounded by class A and interface D
class Test2<T extends A & D> {

	T objectRef;

	public Test2(T obj) {
		this.objectRef = obj;
	}

	public void doRun() {
		this.objectRef.doRun();
	}
}

public class Bounds_Generic_Types {

	public static void main(String[] args) {

		Test2<A> ta = new Test2<>(new A());
		ta.doRun();// Inside Super Class A

		Test2<B> tb = new Test2<>(new B());
		tb.doRun();// Inside Sub Class B

		Test2<C> tc = new Test2<>(new C());
		tc.doRun();// Inside Sub Class C

		/*
		 * Bound mismatch: The type String is not a valid substitute for the bounded
		 * parameter <T extends A> of the type Test2<T> as String is not subclass of A.
		 */
		// Test2<String> ts = new Test2(new String());
	}

}
