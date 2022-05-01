/**
 * 
 */
package ProgrammingFundamentals;

/**
 * @author nbwoz
 *
 */
public class Operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		// Bitwise and // 0101 | & 0111 = 0101 = 5
		System.out.println("a&b = " + (a & b));
		
		// Bitwise or // 0101 | 0111=0111 = 7
		System.out.println("a|b = " + (a | b));
		
		// Bitwise xor 0101 ^ 0111= 0010 = 2
		System.out.println("a^b = " + (a ^ b));
		
		// Bitwise not // ~0101=1010 will give 2's complement of 1010 = -6
		System.out.println("~a = " + ~a);
		
		// Can also be combined with asssignment operator
	}

}
