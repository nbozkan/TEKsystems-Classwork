package model;

public class Espresso extends Product {
	boolean extraShot, macchiato;

	/**
	 * @return the extraShot
	 */
	public boolean isExtraShot() {
		return extraShot;
	}

	/**
	 * @param extraShot the extraShot to set
	 */
	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	/**
	 * @return the macchiato
	 */
	public boolean isMacchiato() {
		return macchiato;
	}

	/**
	 * @param macchiato the macchiato to set
	 */
	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}

	public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
		super(name, price, description);
		// TODO Auto-generated constructor stub
		this.extraShot = extraShot;
		this.macchiato = macchiato;
	}

	public Espresso() {
		super("Espresso", 2.50, "Bold, black and string");
		this.extraShot = false;
		this.macchiato = false;
	}

	@Override
	public double calculateProductSubtotal(int quantity) {
		double addOns = 0;
		if (extraShot)
			addOns += 2.00;
		if (macchiato)
			addOns += 1.00;
		return quantity * price + addOns;
	}
}