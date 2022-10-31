package exercicio1;

import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import exercicio1.entities.Person;

public class Program {

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Birth date (Format: dd/MM/yyyy): ");
			String birthDate = sc.nextLine();
			System.out.print("Height (Example: 1.75): ");
			double height = sc.nextDouble();

			Person person = new Person(name, birthDate, height);

			System.out.println(person);

			sc.close();
		} catch (DateTimeParseException e) {
			System.out.println("Invalid date format");
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}
	}

}
