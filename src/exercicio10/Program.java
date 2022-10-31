package exercicio10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio10.entities.FootballPlayer;

public class Program {

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		FootballPlayer fPlayer = new FootballPlayer();
		List<FootballPlayer> list = new ArrayList <FootballPlayer>();
		
		try {
		System.out.print("Enter the number of players: ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Player nº: %d%n", i + 1);
			System.out.print("Player name: ");
			String name = sc.nextLine();
			System.out.print("Position (defender / midfielder / striker): ");
			String position = sc.nextLine();
			System.out.print("Birth date (format dd/MM/yyyy): ");
			String birthDate = sc.nextLine();
			LocalDate dt = LocalDate.parse(birthDate, dtf);
			System.out.print("Nationality: ");
			String nationality = sc.nextLine();
			System.out.print("Height: ");
			double height = sc.nextDouble();
			System.out.print("Weight: ");
			double weight = sc.nextDouble();
			int age = fPlayer.playerAge(dt);
		
			fPlayer = new FootballPlayer(name, position, dt, age, nationality, height, weight);
			list.add(fPlayer);	
		}
		
		System.out.println();
		
		for (FootballPlayer f : list) {
			System.out.println(f.showPlayerData(f));
		}
		sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		} catch (DateTimeParseException e) {
			System.out.println("Invalid date format");
		}
	}
}
