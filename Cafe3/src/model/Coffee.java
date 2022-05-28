package model;

import java.util.Scanner;

public class Coffee extends Product {
	private boolean sugar, milk;

	public Coffee(String name, double price, String description, boolean sugar, boolean milk) {
		super(name, price, description);
		// TODO Auto-generated constructor stub
		this.sugar = sugar;
		this.milk = milk;
	}

	public Coffee() {
		super("Coffee", 1.25, "Boiled bean juice.");
		this.sugar = false;
		this.milk = false;
	}

	/**
	 * @return the sugar
	 */
	public boolean isSugar() {
		return sugar;
	}

	/**
	 * @param sugar the sugar to set
	 */
	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}

	/**
	 * @return the milk
	 */
	public boolean isMilk() {
		return milk;
	}

	/**
	 * @param milk the milk to set
	 */
	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	@Override
	public double calculateProductSubtotal(int quantity) {
		// TODO Auto-generated method stub
		return quantity * price;
	}

	@Override
	public void addOptions(Scanner input) {
		// TODO Auto-generated method stub
		String addMilk, addSugar;

		System.out.println("How many coffees would you like?");
		int numCoffees = input.nextInt();
		this.setQuantity(numCoffees);

		System.out.println("Would you like milk with your coffee? Enter Y or N.");
		addMilk = input.next();

		if (addMilk.equals("y")) {
			this.setMilk(true);
		}

		System.out.println("Would you like sugar with your coffee? Enter Y or N.");
		addSugar = input.next().toLowerCase();

		if (addSugar.equals("y")) {
			this.setSugar(true);
		}
	}

	@Override
	public void printOptions() {
		// TODO Auto-generated method stub
		System.out.printf("Item:\t%s \tPrice: $%.2f \tQty: %d \tSubtotal: $%.2f\n", getName(), getPrice(),
				getQuantity(), calculateProductSubtotal(quantity));
		System.out.printf("\tSugar: %s \tMilk: %s\n\n", sugar ? "Yes" : "No", milk ? "Yes" : "No");
	}
}
