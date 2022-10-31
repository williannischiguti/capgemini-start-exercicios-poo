package exercicio6.service;

public class Invoice {
	
	private int item;
	private String description;
	private double quantity;
	private double price;
	
	public Invoice() {
		
	}

	public Invoice(int item, String description, double quantity, double price) {
		this.item = item;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getInvoiceAmount (double quantity, double price) {
		return quantity * price;
	}
}
