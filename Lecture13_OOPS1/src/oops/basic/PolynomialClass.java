package oops.basic;

public class PolynomialClass {

	/*
	 * Polynomial is combination expression of degree and coefficients. Therefore we
	 * are assuming index of coefficient array as degree and value at index as
	 * coefficient.
	 */
	int coefficient[] = new int[100];

	public void setCoefficient(int degree, int coeff) {
		coefficient[degree] += coeff;
	}

	// Prints all the terms(only terms with non zero coefficients are to be printed)
	// in increasing order of degree.
	public void print() {
		for (int degree = 0; degree < coefficient.length; degree++) {
			if (coefficient[degree] != 0) {
				System.out.print(coefficient[degree] + "x" + degree + " ");
			}
		}
		System.out.println();
	}

	// Adds two polynomials and returns a new polynomial which has result
	public PolynomialClass add(PolynomialClass p) {
		for (int i = 0; i < this.coefficient.length; i++) {
			for (int j = 0; j < p.coefficient.length; j++) {
				if (i == j && (this.coefficient[i] != 0 || p.coefficient[j] != 0)) {
					this.coefficient[i] += p.coefficient[j];
				}
			}
		}
		return this;
	}

	// Subtracts two polynomials and returns a new polynomial which has result
	public PolynomialClass subtract(PolynomialClass p) {
		for (int i = 0; i < this.coefficient.length; i++) {
			for (int j = 0; j < p.coefficient.length; j++) {
				if (i == j && (this.coefficient[i] != 0 || p.coefficient[j] != 0)) {
					this.coefficient[i] -= p.coefficient[j];
				}
			}
		}
		return this;
	}

	// Multiply two polynomials and returns a new polynomial which has result
	public PolynomialClass multiply(PolynomialClass p) {
		PolynomialClass a = new PolynomialClass();
		for (int i = 0; i < this.coefficient.length / 2; i++) {
			for (int j = 0; j < p.coefficient.length / 2; j++) {
				a.coefficient[(i + j)] += this.coefficient[i] * p.coefficient[j];
			}
		}
		return a;
	}

}
