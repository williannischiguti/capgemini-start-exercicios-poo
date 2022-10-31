package exercicio6;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import exercicio6.service.Invoice;

public class Program {

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Invoice");
		int cod = (int) (Math.random() * 9999) + 1; 
		System.out.printf("Item %d%n", cod);
		try {
		System.out.print("Description: ");
		String description = sc.nextLine();
		System.out.print("Quantity: ");
		double quantity = sc.nextDouble();
		quantity = (quantity >= 0) ? quantity : 0;
		System.out.print("Price: ");
		double price = sc.nextDouble();
		price = (price >= 0) ? price : 0;
		
		Invoice invoice = new Invoice (cod, description, quantity, price);
		System.out.printf("Invoice amount: R$ %.2f%n", invoice.getInvoiceAmount(quantity, price));
		
		sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}
	}
}
