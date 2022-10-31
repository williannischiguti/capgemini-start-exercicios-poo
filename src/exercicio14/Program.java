package exercicio14;

import java.util.Locale;

import exercicio14.service.Invoice;

public class Program {

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Invoice invoice = new Invoice();

		// Invoice(Integer number, String description, Integer quantity, Double price)
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				invoice = new Invoice(i + 1, "Item1", (int) (Math.random() * 1000) + 1, Math.random() * 1000);
				invoice.showTotalInvoice(invoice);
			} else if (i == 1) {
				invoice = new Invoice(i + 1, "Item2", (int) (Math.random() * 1000) + 1, Math.random() * 1000);
				invoice.showTotalInvoice(invoice);
			} else if (i == 2) {
				invoice = new Invoice(i + 1, "Item3", (int) (Math.random() * 1000) + 1, Math.random() * 1000);
				invoice.showTotalInvoice(invoice);
			}
		}

	}
}
