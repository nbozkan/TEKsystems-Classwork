package model;

import java.util.Scanner;

public class Cappuccino extends Product {
	public boolean peppermint, whippedCream;

	public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
		super(name, price, description);
		// TODO Auto-generated constructor stub
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;
	}

	public Cappuccino() {
		super("Cappuccino", 5.25, "Lots of foam.");
		this.peppermint = false;
		this.whippedCream = false;
	}

	/**
	 * @return the peppermint
	 */
	public boolean isPeppermint() {
		return peppermint;
	}

	/**
	 * @param peppermint the peppermint to set
	 */
	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}

	/**
	 * @return the whippedCream
	 */
	public boolean isWhippedCream() {
		return whippedCream;
	}

	/**
	 * @param whippedCream the whippedCream to set
	 */
	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}

	@Override
	public double calculateProductSubtotal(int quantity) {
		// TODO Auto-generated method stub
		double addOns = 0;
		if (peppermint)
			addOns += 2.00;
		if (whippedCream)
			addOns += 1.00;
		return price * quantity + addOns;
	}

	@Override
	public void addOptions(Scanner input) {
		// TODO Auto-generated method stub
		String addPeppermint, addWhippedCream;

		System.out.println("How many cappuccinos would you like?");
		int numCappucinos = input.nextInt();
		this.setQuantity(numCappucinos);

		System.out.println("Would you like peppermint with your cappuccino? Enter Y or N.");
		addPeppermint = input.next();

		if (addPeppermint.equals("y")) {
			this.setPeppermint(true);
		}

		System.out.println("Would you like whipped cream with your cappuccino? Enter Y or N.");
		addWhippedCream = input.next().toLowerCase();

		if (addWhippedCream.equals("y")) {
			this.setWhippedCream(true);
		}
	}

	@Override
	public void printOptions() {
		// TODO Auto-generated method stub
		System.out.printf("Item:\t%s \tPrice: $%.2f \tQty: %d \tSubtotal: $%.2f\n", getName(), getPrice(),
				getQuantity(), calculateProductSubtotal(quantity));
		System.out.printf("\tPeppermint: %s \tWhipped Cream: %s\n\n", peppermint ? "Yes (Add $2 per drink)" : "No",
				whippedCream ? "Yes (Add $1 per drink)" : "No");
	}
}