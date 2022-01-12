package oops.finalKeyword;

class Pen {

	final int price = 15;
}

public class FinalKeyword {

	public static void main(String[] args) {
		Pen p = new Pen();
		// p.price=20; // Compilation Error as price is final
		System.out.println(p.price);
	}

}
