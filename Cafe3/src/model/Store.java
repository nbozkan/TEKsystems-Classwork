package model;

import java.util.Scanner;

public class Store {
	public static void menu() {
		int choice = -1;

		try (Scanner input = new Scanner(System.in);) {
			while (choice != 4) {
				System.out.println("Please select from the following menu:\n");
				System.out.println("1: Coffee");
				System.out.println("2: Cappuccino");
				System.out.println("3: Espresso");
				System.out.println("4: Check Out");
				choice = input.nextInt();

				switch (choice) {
				case 1:
					Coffee coffee = new Coffee();
					coffee.addOptions(input);
					coffee.printOptions();
					Cart.addToCart(coffee);
					break;
				case 2:
					Cappuccino cappucino = new Cappuccino();
					cappucino.addOptions(input);
					cappucino.printOptions();
					Cart.addToCart(cappucino);
					break;
				case 3:
					Espresso espresso = new Espresso();
					espresso.addOptions(input);
					espresso.printOptions();
					Cart.addToCart(espresso);
					break;
				case 4:
					input.close();
					System.out.println("\nProceed to checkout.\n");
					Cart.checkout();
					break;
				default:
					System.out.println("You must enter 1, 2, or 3 to add product!\n");
				}
			}
		}
	}
}