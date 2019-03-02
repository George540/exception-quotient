package ExceptionPractise;

// Personal project for practicing Exceptions Handling
// Made by: George Mavroeidis in March 2nd 2019

/* In this program, I take a simple division of two integers and handle any possible exceptions that may occur.
 * I created a class called "QuotientWithException" where it calculates the division and throws
 * an ArithmeticException if the divisor is 0. An additional existing exception called "InputMismatchException"
 * handles the incorrect input by the user. For example, if a user enters a character or a string, the exception
 * is thrown and caught and the loop allows user to re-enter inputs and try again.
*/

import java.util.*;

public class DriverDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean repeat = true;
		
		do {
			try {
				System.out.print("Enter two integers: ");
				int n1 = keyboard.nextInt();
				int n2 = keyboard.nextInt();
				
				int result = QuotientWithException.quotient(n1, n2);
				System.out.println(n1 + "/" + n2 + " is " + result);
				
				repeat = false;
			}
			catch (InputMismatchException e) {
				System.out.println("Incorrect Input (must be integer). Please try again.");
				keyboard.nextLine();
			}
			catch (ArithmeticException e) {
				System.out.println("Divisor cannot be zero. Please try again.");
			}
		} while (repeat == true);
		
		System.out.println("Program is closing.");

	}

}
