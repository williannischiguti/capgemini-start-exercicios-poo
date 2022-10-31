package exercicio11.entities;

public class Ticket {

	private double amount;
	
	public Ticket() {
		
	}

	public Ticket(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double showAmount(double amount) {
		return amount;
	}
}
