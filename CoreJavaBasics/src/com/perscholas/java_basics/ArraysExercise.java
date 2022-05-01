/**
 * 
 */
package com.perscholas.java_basics;

import java.util.Arrays;

/**
 * @author nbwoz
 *
 */
public class ArraysExercise
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// 1
		int[] one = { 1, 2, 3 };
		System.out.println(Arrays.toString(one));

		// 2
		int[] two = { 13, 5, 7, 68, 2 };
		int middleNumber = two.length / 2;
		System.out.println(two[middleNumber]);

		// 3
		String[] strings = { "red", "green", "blue", "yellow" };
		System.out.println(strings.length);
		String[] strings2 = strings.clone();
		System.out.println(Arrays.toString(strings2));

		// 4
		int[] four = { 1, 2, 3, 4, 5, 6 };
		System.out.println(four[0] + " ");
		System.out.print(four[four.length - 1] + " ");
		System.out.print(four[5]);

		// 5
		System.out.println();
		int[] five = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < five.length; i++)
		{
			System.out.println(five[i]);
		}

		// 6
		int[] six = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < six.length; i++)
		{
			int j = 2 * six[i];
			six[i] = j;
		}
		System.out.println(Arrays.toString(six));

		// 7
		System.out.println();
		int[] seven = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < seven.length; i++)
		{
			if (i != seven.length / 2)
			{
				System.out.print(seven[i] + " ");
			}
		}
		System.out.println();

		// 8
		String[] eight = { "H", "e", "l", "l", "o" };

		String firstString = eight[0];

		int middleIndex = eight.length / 2;
		String secondString = eight[middleIndex];

		eight[0] = secondString;
		eight[middleIndex] = firstString;

		System.out.println(Arrays.toString(eight));

		// 9
		int[] numbers = { 4, 2, 9, 13, 1, 0 };
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println("The smallest number is " + numbers[0]);
		System.out.println("The largest number is " + numbers[numbers.length - 1]);

		// 10
		Object[] objects = { 9, "Hello", "fish", "taco", 3.14 };

		System.out.println(Arrays.toString(objects));
	}

}
