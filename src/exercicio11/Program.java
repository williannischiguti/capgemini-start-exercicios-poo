package exercicio11;

import java.util.Locale;

import exercicio11.entities.Ticket;
import exercicio11.entities.VipTicket;

public class Program {

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		double TICKETVALUE = 13.00;
		Ticket ticket = new Ticket();

		ticket = new Ticket(TICKETVALUE);
		System.out.printf("Normal ticket: %.2f%n", ticket.showAmount(TICKETVALUE));

		ticket = new VipTicket(TICKETVALUE);
		System.out.printf("Vip ticket: %.2f", ticket.showAmount(TICKETVALUE));
	}
}
