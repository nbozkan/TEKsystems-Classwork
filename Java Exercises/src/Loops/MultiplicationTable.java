/**
 * 
 */
package Loops;

/**
 * @author nbwoz
 *
 */
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Uses nested loops to print a multiplication table
		for(int x = 1; x <= 12; x++)
		{
			for(int y = 1; y <=12; y++)
			{
				System.out.print((x * y) + "\t");
			}
			System.out.println();
		}

	}

}
