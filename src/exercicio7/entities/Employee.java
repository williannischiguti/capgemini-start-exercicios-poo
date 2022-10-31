package exercicio7.entities;

import java.util.List;

public class Employee {

	private String firstName;
	private String lastName;
	private Double monthlySalary;
	
	public Employee() {
		
	}

	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public void showAnnualSalary (Employee employee) {
		System.out.printf("Annual Salary: R$ %.2f%n", employee.getMonthlySalary() * 12);
	}
	
	public double salaryIncrease (Employee employee) {
		return employee.getMonthlySalary() * 1.10;
	}
	
	public void listOfEmployees(List<Employee> list) {
		System.out.println("List of Employees:");
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("Full name: %s | Annual salary after 10%% increase: %.2f%n", 
					(list.get(i).getFirstName() + " " + list.get(i).getLastName()), 
					salaryIncrease(list.get(i)) * 12);
		}
	}
}
