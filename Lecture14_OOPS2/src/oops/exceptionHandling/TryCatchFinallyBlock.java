package oops.exceptionHandling;

/*Exception Handling in Java
The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.*/
public class TryCatchFinallyBlock {

	public static void main(String[] args) {
		/*
		 * Difference between Checked and Unchecked Exceptions
		 * 
		 * 1) Checked Exception The classes that directly inherit the Throwable class
		 * except RuntimeException and Error are known as checked exceptions. For
		 * example, IOException, SQLException, etc. Checked exceptions are checked at
		 * compile-time.
		 * 
		 * 2) Unchecked Exception The classes that inherit the RuntimeException are
		 * known as unchecked exceptions. For example, ArithmeticException,
		 * NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked
		 * exceptions are not checked at compile-time, but they are checked at runtime.
		 * 
		 * 3) Error Error is irrecoverable. Some example of errors are OutOfMemoryError,
		 * VirtualMachineError, AssertionError etc.
		 */

		/*
		 * Java Exception Keywords Java provides five keywords that are used to handle
		 * the exception.
		 * 
		 * try The "try" keyword is used to specify a block where we should place an
		 * exception code. It means we can't use try block alone. The try block must be
		 * followed by either catch or finally.
		 * 
		 * catch The "catch" block is used to handle the exception. It must be preceded
		 * by try block which means we can't use catch block alone. It can be followed
		 * by finally block later.
		 * 
		 * finally The "finally" block is used to execute the necessary code of the
		 * program. It is executed whether an exception is handled or not.
		 * 
		 * throw The "throw" keyword is used to throw an exception.
		 * 
		 * throws The "throws" keyword is used to declare exceptions. It specifies that
		 * there may occur an exception in the method. It doesn't throw an exception. It
		 * is always used with method signature.
		 */

		try {
			int data = 50 / 0; // may throw exception
								// if exception occurs, the remaining statement will not exceute
			System.out.println("rest of the code");
		}
		// handling the exception
		catch (Exception e) {
			e.printStackTrace();
		}

		try {

			System.out.println("Inside try block");

			// below code throws divide by zero exception
			int data = 25 / 0;
			System.out.println(data);
		}

		// handles the Arithmetic Exception / Divide by zero exception
		catch (ArithmeticException e) {
			System.out.println("Exception handled");
			System.out.println(e);
		}

		// executes regardless of exception occured or not
		finally {
			System.out.println("finally block is always executed");
		}

	}

}
