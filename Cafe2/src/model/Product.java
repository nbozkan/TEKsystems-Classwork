package model;

public abstract class Product {
	protected String name;
	protected double price;
	protected String description;
	protected int quantity;

	/**
	 * @param name
	 * @param price
	 * @param description
	 * @param quantity
	 */
	public Product(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public abstract double calculateProductSubtotal(int quantity);
}