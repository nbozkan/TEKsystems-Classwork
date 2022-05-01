/**
 * 
 */
package com.perscholas.java_basics;

/**
 * @author nbwoz
 *
 */
public class VariablesExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1
		int a = 1;
		int b = 2;
		int intSum = a + b;
		System.out.println(intSum);
		
		// 2
		double c = 1.5;
		double d = 2.5;
		double doubleSum = c + d;
		System.out.println(doubleSum);
		
		// 3
		int e = 3;
		double f = 3.5;
		double intDoubleSum = e + f;
		System.out.println(intDoubleSum);
		// The sum variable must be of type double.
		
		// 4
		int g = 8;
		int h = 4;
		int intRemainder = g / h;
		System.out.println(intRemainder);
		// The int needs to be cast into a type that accepts a floating point value.
		
		// 5
		double i = 10.0;
		double j = 5.0;
		double doubleRemainder = i / j;
		System.out.println(doubleRemainder);
		j = (int) 5;
		doubleRemainder = i / j;
		System.out.println(doubleRemainder);
		
		// 6
		int x = 5;
		int y = 6;
		double q = x / y;
		System.out.println(q);
		double z = y;
		q = z;
		System.out.println(q);
		
		// 7
		final int HUNDRED = 100;
		int threeHundred = 3 * HUNDRED;
		System.out.println(threeHundred);
		
		// 8
		double coffeePrice = 3;
		double croissantPrice = 2;
		double lattePrice = 4;
		double subTotal;
		double totalSale;
		
		subTotal = (3 * coffeePrice) + (4 * croissantPrice) + (2 * lattePrice);
		final double SALES_TAX = 0.675;
		totalSale = (subTotal * SALES_TAX) + subTotal;
		System.out.println(String.format("%.2f", totalSale));
	}

}
