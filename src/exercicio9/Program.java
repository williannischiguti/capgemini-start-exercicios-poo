package exercicio9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import exercicio9.entities.Flight;

public class Program {

	public static void main(String args[]) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime dt1 = LocalDateTime.parse("29/10/2022 15:30", dtf);
		LocalDateTime dt2 = LocalDateTime.parse("05/11/2022 19:00", dtf);
		LocalDateTime dt3 = LocalDateTime.parse("05/01/2023 21:30", dtf);
		Flight f = new Flight();
		Map <Integer, Boolean> map1 = new HashMap <Integer, Boolean>();
		Map <Integer, Boolean> map2 = new HashMap <Integer, Boolean>();
		Map <Integer, Boolean> map3 = new HashMap <Integer, Boolean>();
		int passangers1 = (int) (Math.random() * 80) + 20;
		int passangers2 = (int) (Math.random() * 80) + 20;
		int passangers3 = (int) (Math.random() * 80) + 20;
		
		// adicionando objetos nas listas
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				f.getList().add(new Flight(passangers1, i + 1, dt1, map1));
				f.getList().get(i).initialize(f.getList().get(i));
			}
			else if (i == 1) {
				f.getList().add(new Flight(passangers2, i + 1, dt2, map2));
				f.getList().get(i).initialize(f.getList().get(i));
			}
			else if (i == 2) {
				f.getList().add(new Flight(passangers3, i + 1, dt3, map3));
				f.getList().get(i).initialize(f.getList().get(i));
			}
		}
		
		// Mostra os dados (número do voo, data e passageiros) de cada voo
		for (Flight flight : f.getList()) {
			System.out.println("Fly number: " + flight.getFlightNumber() + 
					           " | Date: " + flight.getDate() + 
					           " | Passengers: " + flight.getPassengers());
		}
		
		// Ocupando os assentos em ordem sequencial com o limite de passageiros de cada voo
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < f.getList().get(i).getPassengers(); j++) {
				f.getList().get(i).occupySeat(j + 1, f.getList().get(i));
			}
		}
		
		System.out.println();
				
		// Após a ocupação dos assentos, mosta o total de assentos disponíveis de cada voo
		for (Flight flight : f.getList()) {
			System.out.printf("Fly number: %d | Total available seat: %d%n", 
					flight.getFlightNumber(), f.totalAvailableSeat(flight));
		}
		
		System.out.println();
		
		// Mostra o próximo asssento livre, após a ocupação sequencial dos assentos
		for (Flight flight : f.getList()) {
			System.out.printf("Fly number: %d | next free seat: %d%n",
					flight.getFlightNumber(), flight.nextFreeSeat(flight));
		}
		
		System.out.println();
		
		// Verifica por um número aleatório se o assento está livre ou não
		for (Flight flight : f.getList()) {
			int randomNumber = (int) (Math.random() * 80) + 20;
			System.out.printf("Fly number: %d | seat number: %d | status: %s%n",
					flight.getFlightNumber(), randomNumber,
				   (flight.checkSeat(randomNumber, flight) ? "Not available" : "available"));
		}
	}
}
