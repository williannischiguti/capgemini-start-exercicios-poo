package exercicio8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import exercicio8.entities.Date;

public class Program {
	
	public static void main (String args []) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.print("Enter a date (format dd/MM/yyyy): ");
		String date = sc.nextLine();
		
		try {
			LocalDate collectedDate = LocalDate.parse(date, dtf);
			Date dt = new Date(collectedDate);
			LocalDate.now();
			System.out.printf("Compare current date " + LocalDate.now().getDayOfMonth() + "/" + 
			LocalDate.now().getMonthValue() + "/" + LocalDate.now().getYear() + 
			" to " + date + " | difference: " + dt.compareDate(collectedDate));
			System.out.println();
			System.out.println("Day of month: " + dt.getDay(collectedDate));
			System.out.println("Month value: " + dt.getMonthValue(collectedDate));
			System.out.println("Month: " + dt.getMonth(collectedDate));
			System.out.println("Year: " + dt.getYear(collectedDate));
			System.out.println("Leap year: " + dt.leapYear(collectedDate));
			System.out.println("Clone: " + dt.clone(collectedDate).getDate());
		} catch (DateTimeParseException e) {
			System.out.println("Invalid date format");
		}

		sc.close();
	}

}
