package exercicio2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import exercicio2.entities.Account;

public class Program {

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name = "";

		int accountNumber = (int) (Math.random() * 9999) + 1;
		System.out.printf("Account number: %d%n", accountNumber);
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.println();

		Account acc = new Account(accountNumber, name, 0);

		int option = 0;
		double amount = 0;

		while (option != 4) {

			System.out.printf("Hello, %s%n", name);
			System.out.println("What do you want to do next? ");
			System.out.println();
			System.out.println("1 - Deposit | 2 - Withdraw | 3 - Show Extract | 4 - Exit");
			option = sc.nextInt();

			try {
				if (option == 4) {
					System.out.println("See you next time ;)");
					break;
				} else if (option == 1) {
					System.out.print("Amount for deposit: ");
					amount = sc.nextDouble();
					acc.deposit(amount);
				} else if (option == 2) {
					System.out.printf("Balance: %.2f%n", acc.showBalance());
					System.out.print("Amount for withdraw: ");
					amount = sc.nextDouble();
					if (acc.getBalance() >= amount) {
						acc.withdraw(amount);	
					} else {
						System.out.println("You don't have enough balance");
					}
				} else if (option == 3) {
					acc.extract();
				}
				System.out.println();
			} catch (InputMismatchException e) {
				System.out.println("Invalid value");
			}
		}
		sc.close();
	}

}
