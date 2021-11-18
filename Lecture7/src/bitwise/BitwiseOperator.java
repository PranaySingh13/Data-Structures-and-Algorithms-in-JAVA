package bitwise;

public class BitwiseOperator {

	public static void main(String[] args) {

		// Bitwise AND
		System.out.println(2 & 4);
		// Bitwise OR
		System.out.println(2 | 4);
		// Bitwise XOR
		System.out.println(2 ^ 4);
		// Bitwise NOT
		System.out.println(~2);

		// bitwise leftshift
		System.out.println(10 << 2);
		System.out.println(-4 << 1);

		// bitwise rightshift
		System.out.println(10 >> 2);
		System.out.println(-4 >> 1);

		// increment/decrement operator
		int a = 10;
		int x = a++;
		System.out.println(x + " " + a);
		int b = 10;
		int y = ++b;
		System.out.println(y + " " + b);
		int c = 10;
		int z = c--;
		System.out.println(z + " " + c);
		int d = 10;
		int w = --d;
		System.out.println(w + " " + d);

		// Conditional Operator ( ? : )
		// variable x = (expression) ? value if true : value if false

		int p, q;
		p = 10;
		q = (p == 1) ? 20 : 30;
		System.out.println(p + " " + q);
		q = (p == 10) ? 20 : 30;
		System.out.println(p + " " + q);
	}

}
