package arrays;

public class ArrayUse {

	public static void main(String[] args) {

		int iarr[] = new int[10];
		System.out.println(iarr[0]);

		iarr[0] = 4;
		System.out.println(iarr[0]);

		/*
		 * System.out.println(iarr[10]);//ArrayIndexOutOfBoundsException
		 * System.out.println(iarr[-1]);//ArrayIndexOutOfBoundsException
		 */

		char carr[] = new char[5];

		double darr[] = new double[5];

		boolean barr[] = new boolean[9];

		System.out.println(carr[0]);

		System.out.println(darr[0]);

		System.out.println(barr[0]);
	}

}
