/**
 * 
 */
package Interface;

import java.util.Scanner;

/**
 * @author nbwoz
 *
 */
public class Main
{
	static Scanner scan;

	public static void main(String[] args)
	{
		scan = new Scanner(System.in);
		// implementing the abstract method
		Calc mainCal = (int[] numbers) ->
		{
			System.out.print("Enter the operation's operation ( /, + , - , *): ");
			scan = new Scanner(System.in);
			String operator = scan.nextLine();

			double output = 0;
			switch (operator)
			{
			case "+":
				for (int numb : numbers)
				{
					output += numb;
				}
				break;
			case "-":
				for (int numb : numbers)
					output -= numb;
				break;
			case "*":
				output = 1;
				for (int numb : numbers)
					output *= numb;
				break;
			case "/":
				output = 1;
				if (numbers.length > 2)
				{
					System.out.println("You can't enter more than 2 numbers");
					break;
				}
				output = numbers[0] / numbers[1];
				break;

			default:
				System.out.println("Invalid operator");
				break;
			}
			return output;
		};

		System.out.print("Specify please the number of your array: ");
		int arraySize = scan.nextInt();
		int[] userInput = new int[arraySize];
		for (int i = 0; i < arraySize; i++)
		{
			System.out.print("Your input: ");
			userInput[i] = scan.nextInt();
			System.out.println();
		}

		System.out.println(mainCal.compute(userInput));
		scan.close();
	}
}
