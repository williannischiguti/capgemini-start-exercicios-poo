package exercicio14.service;

public class Invoice {

	Integer number;
	String description;
	Integer quantity;
	Double price;
	
	public Invoice() {
		
	}

	public Invoice(Integer number, String description, Integer quantity, Double price) {
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public double getTotalInvoice (Invoice invoice) {
		return (invoice.getQuantity() >= 0 && invoice.getPrice() >= 0) ?
				invoice.getQuantity() * invoice.getPrice() : 0;
	}

	public void showTotalInvoice(Invoice invoice) {
		System.out.printf("Invoice number: %d%n"
						+ "Description: %s | Quantity: %d | Price: %f | Total: %.2f%n", 
						   invoice.getNumber(), invoice.getDescription(), invoice.getQuantity(), 
						   invoice.getPrice(), invoice.getTotalInvoice (invoice));;
	}
}
