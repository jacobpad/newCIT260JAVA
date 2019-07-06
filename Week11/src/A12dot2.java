
/**
 * <h1>Jacob Padgett</h1>
 * <h2>Brother Jones</h2>
 * <h2>Week 10</h2>
 * <p>CIT 260</p>
 * <h3>12.2</h3>
 * <p>Write a program that prompts the user to read two intigers 
 * and displays their sum. Your program should prompt the user
 * to read the number again if the input is incorrect.</p>
 */
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Jacob Padgett
 */

public class A12dot2 {

	// Check my github if there's errors running the zip file.

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Set up a do/while loop
		int x = 1; // Acts as a boolean
		int num1 = 0; // First number
		int num2 = 0; // Second number
		System.out.print("Please enter two numbers and I'll sum them for you: ");// Prompt for two numbers
		do {
			try {// Start the try
				System.out.println("\nAfter each number, press enter.");
				System.out.print("\nFirst number: ");
				num1 = input.nextInt();
				System.out.print("Second number: ");
				num2 = input.nextInt();
				System.out.println("\nSum = " + (num1 + num2));
				x = 2; // X will change to 2 at the end of this loop, thus breaking out.
			} catch (InputMismatchException ex) {
				System.out.println("\nError - Please make sure what you enter is two numbers - only numbers.");
				input.nextLine();
			}
		} while (x == 1);
		input.close();
	}
}
