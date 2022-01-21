package oops.basic;

public class PolynomialUse {

	public static void main(String[] args) {

		PolynomialClass p1 = new PolynomialClass();
		p1.setCoefficient(0, 1);
		p1.setCoefficient(1, 2);
		p1.setCoefficient(2, 3);
		p1.print();

		PolynomialClass p2 = new PolynomialClass();
		p2.setCoefficient(0, 4);
		p2.setCoefficient(1, 5);
		p2.setCoefficient(2, 6);
		p2.print();

		p1.add(p2);
		p1.print();

		p1.subtract(p2);
		p1.print();

		PolynomialClass p3 = p1.multiply(p2);
		p3.print();

	}

}
