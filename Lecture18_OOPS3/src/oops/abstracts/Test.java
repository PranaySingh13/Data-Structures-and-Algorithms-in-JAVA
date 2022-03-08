package oops.abstracts;

/*An abstract class can have a data member, 
 * abstract method, method body (non-abstract method), 
 * constructor, and even main() method.
 * 
 * That is Abstract Class does not follow 100% abstractration
 * */
abstract class RBI_Bank {
	abstract int rateOfInterest();

	RBI_Bank() {
		System.out.println("Welcome To RBI!");
	}

	void headquaters() {
		System.out.println("Delhi");
	}
}

class SBI extends RBI_Bank {

	@Override
	int rateOfInterest() {

		return 20;
	}
}

class ICICI extends RBI_Bank {

	@Override
	int rateOfInterest() {

		return 40;
	}
}

public class Test {

	public static void main(String[] args) {
		RBI_Bank b = new SBI();
		System.out.println(b.rateOfInterest());

		b = new ICICI();
		System.out.println(b.rateOfInterest());

		b.headquaters();
	}

}
