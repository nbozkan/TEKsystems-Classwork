/**
 * 
 */
package Variables;

/**
 * @author nbwoz
 *
 */
public class Welcome {

	/**
	 * @param args
	 */
	/** Main method */
	public static void main(String[] args) {
		// Declare variables - type, name
		double radius;
		double area;
		final double PI = 3.14159; // constant
		String name = "Nicole Ozkan";
		int number = 100;
		char letterA = 'A';
		boolean winOrLose = true;
		
		// Assign a value
		radius = 20;
		
		// Compute area
		area = radius * radius * Math.PI;
		
		// Display results - String concatenation
		System.out.println("The area for the circle of radius " + radius + " is " + area);
	}

}
