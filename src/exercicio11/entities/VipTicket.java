package exercicio11.entities;

public class VipTicket extends Ticket {
	
	private double amount;
	
	public VipTicket() {
		
	}
	
	public VipTicket(double amount) {
		super();
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public double showAmount(double amount) {
		return amount * 2;
	}
	
}
