package exercicio3.entities;

public class FuelPump {
	
	private String fuelType;
	private double valuePerLiter;
	private double amountOfFuel;
	
	public FuelPump() {
		
	}

	public FuelPump(String fuelType, double valueLiter, double amountOfFuel) {
		this.fuelType = fuelType;
		this.valuePerLiter = valueLiter;
		this.amountOfFuel = amountOfFuel;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getValueLiter() {
		return valuePerLiter;
	}

	public void setValueLiter(double valueLiter) {
		this.valuePerLiter = valueLiter;
	}

	public double getAmountOfFuel() {
		return amountOfFuel;
	}

	public void setAmountOfFuel(double amountOfFuel) {
		this.amountOfFuel = amountOfFuel;
	}
	
	public double fillPerValue (double amount) {
		return amount / valuePerLiter;
	}
	
	public double fillPerLiter(double liters) {
		return liters * valuePerLiter;
	}
	
}
