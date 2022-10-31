package exercicio1.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {

	private String name;
	private String birthDate;
	private double height;

	public Person() {

	}

	public Person(String name, String birthDate, double height) {
		this.name = name;
		this.birthDate = birthDate;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int calculateAge(String birthDate) {
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate collectedDate = LocalDate.parse(birthDate, date);
		LocalDate currentDate = LocalDate.now();
		Period period = Period.between(collectedDate, currentDate);
		return period.getYears();
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + calculateAge(birthDate) + ", Height: " + height;
	}

}
