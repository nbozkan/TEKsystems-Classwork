/**
 * 
 */
package ProgrammingFundamentals;

import java.util.Scanner;

/**
 * @author nbwoz
 *
 */
public class InputExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creates an object of type Scanner
		Scanner input = new Scanner(System.in);
		
		// Ask user for their name
		System.out.print("Enter your name: ");
		
		// Read input (line of text) from the console
		String name = input.nextLine();
		
		// Print name
		System.out.println("My name is " + name);
		System.out.println(input instanceof Scanner);
		
		// Close the scanner
		input.close();
	}

}
