package com.perscholas.java_basics;
/**
 * 
 */

/**
 * @author nbwoz
 *
 */
public class LoopsExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1
		for(int x = 1; x <= 10; x++)
		{
			System.out.println(x);
		}
		
		// 2
		int x = 0;
		while(x <= 100)
		{
			System.out.println(x);
			x = x += 10;
		}
		
		// 3
		x = 1;
		do {
			System.out.println(x++);
		}while(x <= 10);
		
		// 4
		for(x = 1; x <= 100; x++)
		{
			if(x % 5 == 0)
			{
				if((x >= 25) && (x <= 75))
				{
					continue;
				}
				else
				{
					System.out.println(x);
				}
			}
		}
		
		// 5
		for(x = 1; x <= 100; x++)
		{
			if(x % 5 == 0)
			{
				if(x > 50)
				{
					break;
				}
				else
				{
					System.out.println(x);
				}
			 }
	     }
		
		// 6
		for(x = 1; x <= 2; x++)
		{
			System.out.println("Week " + x + ":");
			for(int y = 1; y <= 5; y++)
			{
				System.out.println("Day " + y);
			}
		}
		
		// 7
		for(x = 10; x <= 200; x++)
		{
			int reverse = 0;
			for (int i = x; i > 0; i /= 10)
			{
				reverse = reverse * 10 + i % 10;
				if(x == reverse)
				{
					System.out.println(x + " ");
				}
			}
		}
		
		// 8
		int num1 = 0;
		int num2 = 1;
		for(x = 1; num1 <= 50; ++x)
		{
			System.out.println(num1 + " ");
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
		}
		
		// 9
		for(int i = 0; i <= 10; i++)
		{
			for(int j = 0; j <= 10; j++)
			{
				System.out.println("Inner loop: i:" + i + ", j:" + j);
			}
		}
	}
}
