package exercicio8.entities;

import java.time.LocalDate;

public class Date {

	LocalDate date;

	
	public Date() {
		
	}
	
	public Date(LocalDate date) {
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public int compareDate(LocalDate date) {
		LocalDate currentDate = LocalDate.now();
		return currentDate.compareTo(date);
	}
	
	public int getDay (LocalDate date) {
		return date.getDayOfMonth();
	}
	
	public int getMonthValue (LocalDate date) {
		return date.getMonthValue();
	}
	
	public String getMonth (LocalDate date) {
		return date.getMonth().toString();
	}
	
	public int getYear (LocalDate date) {
		return date.getYear();
	}
	
	public boolean leapYear (LocalDate date) {
		return date.getYear() %4 == 0;
	}
	
	public Date clone (LocalDate date) {
		return new Date(date);
	}
}
