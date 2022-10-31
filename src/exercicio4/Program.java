package exercicio4;

import java.util.Scanner;

import exercicio4.entities.Elevator;

public class Program {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Elevator elevator = new Elevator();
		
		elevator.setCapacity(6);
		elevator.setFloors(10); 
		elevator.initialize(elevator.getCapacity(), elevator.getFloors());
		System.out.printf("Elevator capacity: %d%n", elevator.getCapacity());
		System.out.printf("Total floors: %d%n", elevator.getFloors());
		
		System.out.println();
		System.out.printf("Added to elevator (number of people): 5%n");
		int numberOfPeople = 5;
		elevator.addPerson(numberOfPeople, elevator.getElevatorOccupancy());
		
		System.out.printf("Available spaces: %d%n", elevator.checkSpace(elevator.getElevatorOccupancy()));
		System.out.printf("People in the elevator: %d%n", elevator.checkNumberOfPeople(elevator.getElevatorOccupancy()));
		
		System.out.printf("Removed from elevator (number of people): 3%n");
		numberOfPeople = 3;
		elevator.removePerson(numberOfPeople, elevator.getElevatorOccupancy());
		
		System.out.printf("Available spaces: %d%n", elevator.checkSpace(elevator.getElevatorOccupancy()));
		System.out.printf("People in the elevator: %d%n", elevator.checkNumberOfPeople(elevator.getElevatorOccupancy()));
		
		System.out.printf("Current position: %s%n", 
				(elevator.checkFloor(elevator.getElevatorControl()) == 0) ? 
				"Ground floor" : 
				String.format(String.valueOf(elevator.checkFloor(elevator.getElevatorControl()) 
				+ "/" + elevator.getFloors())));
		
		System.out.print("Move to floor: 6");
		int floorNumber = 6;
		
		System.out.println();
		elevator.moveElevator(floorNumber-1, elevator.getElevatorControl());
		System.out.printf("Current position: %s%n", 
				(elevator.checkFloor(elevator.getElevatorControl()) == 0) ? 
				"Ground floor" : 
				String.format("%d / %d", 
				elevator.checkFloor(elevator.getElevatorControl()) + 1 ,elevator.getFloors()));
		
		sc.close();
	}
}
