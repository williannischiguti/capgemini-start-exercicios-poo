package exercicio15.entities;

public class Employee {
	
	String name;
	String lastName;
	Double salary;
	
	public Employee () {
		
	}

	public Employee(String name, String lastName, Double salary) {
		this.name = name;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public double salaryIncrease (Employee employee) {
		return employee.getSalary() * 1.10;
	}

	@Override
	public String toString() {
		return  String.format("Name: %s | Last name: %s | Salary: %.2f | Annual salary: %.2f",
							   name, lastName, salary, salary * 12);
	}
	
	
	
}
