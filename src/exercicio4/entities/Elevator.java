package exercicio4.entities;

import java.util.ArrayList;
import java.util.List;

public class Elevator {

	private int floors;
	private int capacity;
	private List<Boolean> elevatorOccupancy = new ArrayList<Boolean>();
	private List<Boolean> elevatorControl = new ArrayList<Boolean>();

	public Elevator() {

	}

	public Elevator(int floors, int capacity, List<Boolean> elevatorOccupancy) {
		this.floors = floors;
		this.capacity = capacity;
		this.elevatorOccupancy = elevatorOccupancy;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<Boolean> getElevatorOccupancy() {
		return elevatorOccupancy;
	}

	public void setElevatorOccupancy(List<Boolean> elevatorOccupancy) {
		this.elevatorOccupancy = elevatorOccupancy;
	}

	public List<Boolean> getElevatorControl() {
		return elevatorControl;
	}

	public void setElevatorControl(List<Boolean> elevatorControl) {
		this.elevatorControl = elevatorControl;
	}

	public void initialize(int capacity, int totalFloors) {
		for (int i = 0; i < capacity; i++) {
			elevatorOccupancy.add(false);
		}

		for (int i = 0; i < totalFloors; i++) {
			if (i == 0) {
				elevatorControl.add(true);
			} else {
				elevatorControl.add(false);
			}
		}

	}

	public int checkSpace(List<Boolean> elevatorOccupancy) {
		return (int) elevatorOccupancy.stream().filter(x -> x == false).count();
	}
	
	public int checkNumberOfPeople(List<Boolean> elevatorOccupancy) {
		return (int) elevatorOccupancy.stream().filter(x -> x == true).count();
	}

	public int checkFloor(List<Boolean> elevatorControl) {
		for (int i = 0; i < elevatorControl.size(); i++) {
			if (elevatorControl.get(i) == true) {
				return elevatorControl.indexOf(elevatorControl.get(i));
			}
		}
		return 0;
	}

	public void addPerson(int numberOfPeople, List<Boolean> elevatorOccupancy) {

		int count = 0;

		if (checkSpace(elevatorOccupancy) >= numberOfPeople) {
			for (int i = 0; i < elevatorOccupancy.size(); i++) {
				if (elevatorOccupancy.get(i) == false) {
					elevatorOccupancy.set(i, true);
					count++;
				}
				if (count == numberOfPeople) {
					break;
				}
			}
		}
	}

	public void removePerson(int numberOfPeople, List<Boolean> elevatorOccupancy) {

		int count = 0;

		if (numberOfPeople <= elevatorOccupancy.size() - checkSpace(elevatorOccupancy)) {
			for (int i = 0; i < elevatorOccupancy.size(); i++) {
				if (elevatorOccupancy.get(i) == true) {
					elevatorOccupancy.set(i, false);
					count++;
				}
				if (count == numberOfPeople) {
					break;
				}
			}
		}
	}

	public void moveElevator(int floor, List<Boolean> elevatorControl) {

		if (checkSpace(elevatorOccupancy) < capacity && floor >= 0 && floor <= this.floors) {
			elevatorControl.set(checkFloor(elevatorControl), false);
			elevatorControl.set(floor, true);
		}
	}
}
