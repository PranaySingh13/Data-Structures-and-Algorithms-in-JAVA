package oops.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

// class represents user-defined exception  
class UserDefinedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserDefinedException(String str) {
		// Calling constructor of parent Exception
		super(str);
	}
}

/*
 * Throw:- We can throw either checked or unchecked exceptions in Java by throw
 * keyword. It is mainly used to throw a custom exception.
 */
public class throwAndThrows {

	public static void validate(int age) {
		if (age < 18) {

			// Throwing Unchecked Exception
			throw new ArithmeticException("Person is not eligible to vote.");
		} else {
			System.out.println("Person is eligible to vote");
		}
	}

	/*
	 * Note: If we throw unchecked exception from a method, it is must to handle the
	 * exception or declare in throws clause.
	 * 
	 * If we throw a checked exception using throw keyword, it is must to handle the
	 * exception using catch block or the method must declare it using throws
	 * declaration.
	 */
	@SuppressWarnings({ "resource", "unused" })
	public static void load() throws FileNotFoundException {
		FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
		BufferedReader fileInput = new BufferedReader(file);
		throw new FileNotFoundException();
	}

	public static void main(String[] args) {
		validate(13);
		System.out.println("Rest of the code");

		try {
			load();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			throw new UserDefinedException("This is user defined Exception");
		} catch (UserDefinedException e) {
			System.out.println(e.getMessage());
		}

	}

}
