package exercicio16;

import java.util.Locale;

import exercicio16.entities.Car;

public class Program {
	
	public static void main (String args []) {
		
		Locale.setDefault(Locale.US);
		
		Car car1 = new Car(0, 0);
		Car car2 = new Car(0, 0);
		
		System.out.println("Car 1");
		System.out.println("Fuel tank: " + car1.getFuelTank());
		car1.setFuelTank(car1.fillTank(car1, 20));
		System.out.printf("Updated fuel tank (after filled 20 liters): %.2f%n", car1.getFuelTank());
		car1.moveCar(car1, 200);
		System.out.println("Moving car: 200km");
		System.out.println(car1);
		
		System.out.println();
		
		System.out.println("Car 2");
		System.out.println("Fuel tank: " + car2.getFuelTank());
		car2.setFuelTank(car2.fillTank(car2, 30));
		System.out.printf("Updated fuel tank (after filled 30 liters): %.2f%n", car2.getFuelTank());
		car2.moveCar(car2, 400);
		System.out.println("Moving car: 400km");
		System.out.println(car2);
	}
}
