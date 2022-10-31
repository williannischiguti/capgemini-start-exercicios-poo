package exercicio15;

import java.util.Locale;

import exercicio15.entities.Employee;

public class Program {
	
	public static void main (String args []) {
		
		Locale.setDefault(Locale.US);
		// Employee(String name, String lastName, Double salary)
		Employee employee1 = new Employee("João", "Maria", 2500.00);
		Employee employee2 = new Employee("Maria", "João", 3200.00);
		
		System.out.println("Employee 1:");
		System.out.println(employee1);
		System.out.println();
		System.out.println("Employee 2:");
		System.out.println(employee2);
		System.out.println();
		employee1.setSalary(employee1.salaryIncrease(employee1));
		employee2.setSalary(employee2.salaryIncrease(employee2));
		System.out.println("Salary after increase of 10 %:");
		System.out.println();
		System.out.println("Employee 1:");
		System.out.println(employee1);
		System.out.println();
		System.out.println("Employee 2:");
		System.out.println(employee2);
	}
	
}
