package exercicio3;

import java.util.Locale;
import java.util.Scanner;

import exercicio3.entities.FuelPump;

public class Program {
	
	public static void main (String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		FuelPump fuel = new FuelPump(); 
		double amount = 0;
		
		System.out.print("Type of fuel: ");
		String fuelType = sc.nextLine();
		fuel.setFuelType(fuelType);
		System.out.print("Value/liter: ");
		double fuelValue = sc.nextDouble();
		fuel.setValueLiter(fuelValue);
		System.out.print("Remaining fuel: ");
		double amountOfFuel = sc.nextDouble();
		fuel.setAmountOfFuel(amountOfFuel);
		System.out.println();
		
		System.out.println("Choose option:");
		System.out.print("1 - Fill per value | 2 - Fill per liter: ");
		int option = sc.nextInt();
		
		if (option == 1) {
			System.out.print("Enter the value: ");
			amount = sc.nextDouble();
			System.out.printf("Filled quantity: %.2f%n", fuel.fillPerValue(amount));
		} else if (option == 2) {
			System.out.print("Amount of liters: ");
			amount = sc.nextDouble();
			System.out.printf("Amount to pay: %.2f%n", fuel.fillPerLiter(amount));
		}
		
		sc.close();
	}
}
