package exercicio16.entities;

public class Car {

	private double fuelTank;
	private double kilometers;
	
	public Car() {
		
	}

	public Car(double fuelTank, double kilometers) {
		this.fuelTank = fuelTank;
		this.kilometers = kilometers;
	}

	public double getFuelTank() {
		return fuelTank;
	}

	public void setFuelTank(double fuelTank) {
		this.fuelTank = fuelTank;
	}

	public double getKilometers() {
		return kilometers;
	}

	public void setKilometers(double kilometers) {
		this.kilometers = kilometers;
	}

	public double fillTank (Car car, double liters) {
		return (car.getFuelTank() + liters <= 50) ? car.getFuelTank() + liters : 0;
	}
	
	public void moveCar(Car car, double kilometers) {
		if (car.getFuelTank() >= kilometers / 15) {
			car.setKilometers(car.getKilometers() + kilometers);
			car.setFuelTank(car.getFuelTank() - (kilometers / 15));
		}	
	}

	@Override
	public String toString() {
		return String.format("Travelled distance: %.2f km | Remaining fuel: %.2f liters", kilometers, fuelTank);
	}
	
}
