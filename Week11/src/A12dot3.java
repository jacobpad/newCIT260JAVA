
/**
 * <h1>Jacob Padgett</h1>
 * <h2>Brother Jones</h2>
 * <h2>Week 10</h2>
 * <p>CIT 260</p>
 * <h3>12.3</h3>
 * <p>Write a program that meets the following requirements:                                                                          
 * <ul>
 *  <li>Creates an array with 100 randomly chosen integers.</li>
 *  <li>Prompts the user to enter the index of the array, then displays the          
 *   corresponding element value.</li>
 *  <li>If the specified index is out of bounds, display the message "Out of Bounds".</li>
 * </ul></p>
 */
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Jacob Padgett
 */
public class A12dot3 {

	// Check my github if there's errors running the zip file.
	// https://github.com/jacobpad/newCIT260JAVA

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean tf = true;

		// Invoke getArray method
		int[] array = getArray();

		do {
			System.out.print("Enter an index of an array (0-99): ");
			try { // make sure input is within the bounds of the array
				try { // maken sure the input is a number
					System.out.println("\nValue at that index is " + array[input.nextInt()]);
					tf = false;
				} catch (InputMismatchException ex) {
					System.out.println("\nError - Must input a whole number.\n");
					input.nextLine();
				}
				;
			} catch (ArrayIndexOutOfBoundsException ex) {
				{
					System.out.println("\nError - Input out of Bounds.\n");
				}
			}
		} while (tf);
		input.close();
	}

	/**
	 * Creates array with 100 integers
	 */
	public static int[] getArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		}
		return array;
	}
}
