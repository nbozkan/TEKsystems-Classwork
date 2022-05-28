package model;

public class Product {
	private double price;
	private int quantity;
	private String name, description;

	/**
	 * @param price
	 * @param quantity
	 * @param name
	 * @param description
	 */
	public Product(String name, double price, String description) {

		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double calculateProductTotal(int quantity) {
		return quantity * price;
	}
}