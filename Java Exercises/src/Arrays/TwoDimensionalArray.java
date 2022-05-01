/**
 * 
 */
package Arrays;

/**
 * @author nbwoz
 *
 */
public class TwoDimensionalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Suppose an array matrix is declared as follows
		int[][] matrix = new int [2][2];
		
		// Assign random values to the array using the following loop
		for(int row = 0; row < matrix.length; row++)
		{
			for(int column = 0; column < matrix[row].length; column++)
			{
				matrix[row][column] = (int) (Math.random() * 1000);
				System.out.println(matrix[row][column] + " ");
			}
			// After each row of values, go to a new line
			System.out.println();
		}

	}

}
