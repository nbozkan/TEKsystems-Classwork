/**
 * 
 */
package ConditionalStatements;

/**
 * @author nbwoz
 *
 */
public class DivisibleTwoThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 30;
		boolean divisibleAnd, divisibleOr, divisibleXOr;
		
		// Divisible by 2 AND 3
		divisibleAnd = (num % 2 == 0) && (num % 3 == 0);
		
		// Divisible by 2 OR 3
		divisibleOr = (num % 2 == 0) || (num % 3 == 0);
		
		// Divisible by 2 or 3 but not both
		divisibleXOr = (num % 2 == 0) ^ (num % 3 == 0);
		
		System.out.println(divisibleAnd);
		System.out.println(divisibleOr);
		System.out.println(divisibleXOr);
	}

}
