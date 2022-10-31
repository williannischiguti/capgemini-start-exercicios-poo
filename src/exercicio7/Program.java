package exercicio7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio7.entities.Employee;

public class Program {

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee(null, null, 0);
		List<Employee> list = new ArrayList<Employee>();

		try {
			System.out.print("Number of employees: ");
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				sc.nextLine();
				System.out.println();
				System.out.printf("Employee nº%d%n", i + 1);
				System.out.print("First name: ");
				String firstName = sc.nextLine();
				System.out.print("Last name: ");
				String lastName = sc.nextLine();
				System.out.print("Monthly salary: ");
				double monthlySalary = sc.nextDouble();
				employee = new Employee(firstName, lastName, monthlySalary);
				employee.showAnnualSalary(employee);
				list.add(employee);
			}

			System.out.println();
			employee.listOfEmployees(list);
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}
	}
}
