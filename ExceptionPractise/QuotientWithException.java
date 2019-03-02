package ExceptionPractise;

// Personal project for practicing Exceptions Handling
// Made by: George Mavroeidis in March 2nd 2019
// Class Exception for DriverDemo

public class QuotientWithException {
	
	public static int quotient(int number1, int number2) {
		if (number2 == 0)
			throw new ArithmeticException("Divisor cannot be zero");
		return number1 / number2;
	}
	
}
