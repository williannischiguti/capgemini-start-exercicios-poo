package exercicio9.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flight {

	private int passengers;
	private int flightNumber;
	private LocalDateTime date;
	private Map<Integer, Boolean> seat = new HashMap<Integer, Boolean>();
	private List<Flight> list = new ArrayList<Flight>();

	public Flight() {

	}

	public Flight(int passengers, int flightNumber, LocalDateTime date, Map<Integer, Boolean> seat) {
		this.passengers = passengers;
		this.flightNumber = flightNumber;
		this.date = date;
		this.seat = seat;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Map<Integer, Boolean> getSeat() {
		return seat;
	}

	public void setSeat(Map<Integer, Boolean> seat) {
		this.seat = seat;
	}

	public List<Flight> getList() {
		return list;
	}

	public void setList(List<Flight> list) {
		this.list = list;
	}

	public void initialize(Flight f) {
		for (int i = 0; i < 100; i++) {
			f.getSeat().put(i + 1, false);
		}
	}
	
	public boolean occupySeat(int seatNumber, Flight f) {	
		if (f.getSeat().get(seatNumber) == false) {
			f.getSeat().replace(seatNumber, true);
			return true;
		} else {
			return false;
		}
	}

	public int totalAvailableSeat(Flight f) {
		int sum = 0;
		for (int i = 1; i <= f.getSeat().size(); i++) {
			if (f.getSeat().get(i) == false) {
				sum += 1;
			}
		}
		return sum;
	}

	public boolean checkSeat(int seatNumber, Flight f) {
		return (f.getSeat().get(seatNumber) == true) ? true : false;
	}

	public int nextFreeSeat(Flight f) {
		int result = 0;
		
		for (Integer key : f.getSeat().keySet()) {
			if (f.getSeat().get(key) == false) {
				result = key;
				return result;
			}
		}
		return result;
	}
}
