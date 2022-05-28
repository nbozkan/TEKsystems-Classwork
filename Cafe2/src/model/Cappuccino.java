package model;

public class Cappuccino extends Product {
	boolean peppermint, whippedCream;

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
}