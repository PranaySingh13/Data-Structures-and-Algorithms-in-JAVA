public class String_Vs_StringBuffer_Vs_StringBuilder {

	static StringBuilder sb1 = new StringBuilder();
	static StringBuffer sb2 = new StringBuffer();

	public static void main(String[] args) {

		/*
		 * Note: Geeks now you must be wondering when to use which one, do refer below
		 * as follows:
		 * 
		 * If a string is going to remain constant throughout the program, then use the
		 * String class object because a String object is immutable.
		 * 
		 * If a string can change (for example: lots of logic and operations in the
		 * construction of the string) and will only be accessed from a single thread,
		 * using a StringBuilder is good enough.
		 * 
		 * If a string can change and will be accessed from multiple threads, use a
		 * StringBuffer because StringBuffer is synchronous, so you have thread-safety.
		 * 
		 * If you don’t want thread-safety than you can also go with StringBuilder class
		 * as it is not synchronized.
		 */

		/*
		 * String Buffer makes the String Mutable that is we can modify the string in
		 * Java. String Buffer does not do memory optimization that is it does not store
		 * string in String Pool in heap Memory.Every string buffer has an internal
		 * buffer, with an initial capacity. If the internal buffer overflows, it is
		 * automatically made larger.
		 */

		StringBuffer str = new StringBuffer("abc");
		str.setCharAt(0, 'd');
		str.append("def");
		System.out.println(str + " " + str.length());// dbcdef 6

		StringBuilder str1 = new StringBuilder("abc");
		str1.setCharAt(0, 'd');
		str1.append("def");
		System.out.println(str1 + " " + str1.length());// dbcdef 6

		/*
		 * Where possible, it is recommended that StringBuilder be used in preference to
		 * StringBuffer as it will be faster under most implementations.
		 */
		String_Vs_StringBuffer_Vs_StringBuilder stringBufferBuilderPerformance = new String_Vs_StringBuffer_Vs_StringBuilder();
		stringBufferBuilderPerformance.getStringBufferPerformance();
		stringBufferBuilderPerformance.getStringBuilderPerformance();

		
		//Checking Thread Safety
		Runnable r = () -> {
			for (int i = 0; i < 100; i++) {
				String w = String.valueOf(i * (i + 1) * (i - 1) / 6);
				sb1.append(w);
				sb2.append(w);
			}
		};
		Thread t[] = new Thread[0x10];
		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(r);
			t[i].start();
		}
		for (int i = 0; i < t.length; i++) {
			try {
				t[i].join();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println(sb1.length());// output varies at every run(Thread Unsafe)
		System.out.println(sb2.length());

	}

	public void getStringBufferPerformance() {

		StringBuffer strBufferOne = new StringBuffer();
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 100000; i++) {
			strBufferOne.append(i);
			strBufferOne.append(" ");
			strBufferOne.append(i);
			strBufferOne.append(" ");
		}

		System.out.println("Time Taken by StringBuffer is: " + (System.currentTimeMillis() - startTime) + " ms");

	}

	public void getStringBuilderPerformance() {

		StringBuilder strBuilderOne = new StringBuilder();
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 100000; i++) {
			strBuilderOne.append(i);
			strBuilderOne.append(" ");
			strBuilderOne.append(i);
			strBuilderOne.append(" ");
		}

		System.out.println("Time Taken by StringBuilder is: " + (System.currentTimeMillis() - startTime) + " ms");

	}

}
