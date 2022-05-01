/**
 * 
 */
package com.perscholas.java_basics;

import java.util.Scanner;

/**
 * @author nbwoz
 *
 */
public class ControlFlow
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// 1
		int x = 15;
		if (x < 10)
		{
			System.out.println("Less than 10");
		}

		// 2
		x = 15;
		if (x < 10)
		{
			System.out.println("Less than 10");
		} else if (x > 10)
		{
			System.out.println("Greater than 10");
		}

		// 3
		x = 50;
		if (x < 10)
		{
			System.out.println("Less than 10");
		} else if (x < 10 && x < 20)
		{
			System.out.println("Between 10 and 20");
		} else if (x >= 20)
		{
			System.out.println("Greater than or equal to 20");
		}

		// 4
		x = 5;
		if (x < 10 || x > 20)
		{
			System.out.println("Out of range");
		} else if (x >= 10 && x <= 20)
		{
			System.out.println("In range");
		}

		// 5
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter grade: ");
		int grade = scanner.nextInt();

		if (grade < 60 && grade > 0)
		{
			System.out.println("F");
		} else if (grade >= 60 && grade < 70)
		{
			System.out.println("D");
		} else if (grade >= 70 && grade < 80)
		{
			System.out.println("C");
		} else if (grade >= 80 && grade < 90)
		{
			System.out.println("B");
		} else if (grade >= 90 && grade < 100)
		{
			System.out.println("A");
		} else if (grade < 0 || grade > 100)
		{
			System.out.println("Score out of range");
		}

		// 6
		System.out.println("Enter 1-7 to choose a day of the week: ");
		int day = scanner.nextInt();
		String dayString;
		switch (day)
		{
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString = "Sunday";
			break;
		default:
			dayString = "Out of range";
			break;
		}
		System.out.println(dayString);
	}
}