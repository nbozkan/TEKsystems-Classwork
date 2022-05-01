/**
 * 
 */
package ProgrammingFundamentals;

import java.util.Scanner;

/**
 * @author nbwoz
 *
 */
public class MonetaryUnits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter dollars and cents: ");
		double money = keyboard.nextDouble();
		
		int dollars, quarters, dimes, nickels, pennies;
		
		dollars = (int) Math.floor(money);
		System.out.println(dollars + " dollars");
		
		double remainder = (money % dollars) * 100;
		
		quarters = (int)remainder / 25;
		remainder = remainder % 25;
		
		dimes = (int) remainder / 10;
		remainder = remainder % 10;
		
		nickels = (int) remainder / 5;
		remainder = remainder % 5;
		
		pennies = (int)remainder;
		
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(pennies + " pennies");
		
		keyboard.close();

	}

}
