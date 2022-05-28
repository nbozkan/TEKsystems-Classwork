package app;

import java.util.Scanner;

import model.Product;

public class App {

	public static void main(String[] args) {
		Product coffee = new Product("Coffee", 1.25, "Boiled bean juice.");
		Product espresso = new Product("Espresso", 2.50, "Bold, black and string");
		Product cappuccino = new Product("Cappuccino", 5.25, "Lots of foam.");

		try (Scanner input = new Scanner(System.in);) {
			System.out.println("How many coffees do you want?");
			int coffeeQty = input.nextInt();
			double coffeeSubtotal = coffee.calculateProductTotal(coffeeQty);
			System.out.printf("Product name: %s\nDescription: %s.\nSubtotal: $%.2f\n\n", coffee.getName(),
					coffee.getDescription(), coffeeSubtotal);

			System.out.println("How many espressos do you want?");
			int espressoQty = input.nextInt();
			double espressoSubtotal = espresso.calculateProductTotal(espressoQty);
			System.out.printf("Product name: %s\nDescription: %s.\nSubtotal: $%.2f\n\n", espresso.getName(),
					espresso.getDescription(), espressoSubtotal);

			System.out.println("How many cappuccinos do you want?");
			int cappuccinoQty = input.nextInt();
			double cappuccinoSubtotal = cappuccino.calculateProductTotal(cappuccinoQty);
			System.out.printf("Product name: %s\nDescription: %s.\nSubtotal: $%.2f\n\n", cappuccino.getName(),
					cappuccino.getDescription(), cappuccinoSubtotal);

			double orderSubtotal = coffeeSubtotal + espressoSubtotal + cappuccinoSubtotal;
			double salesTax = .0625 * orderSubtotal;
			double orderTotal = orderSubtotal + salesTax;

			System.out.printf("Your order subtotal is: $%.2f\nSales tax is $%.2f\nOrder Total is: $%.2f", orderSubtotal,
					salesTax, orderTotal);
		}
	}
}