package exercicio13.entities;

public class Calculator {
	
	private double value1;
	private double value2;
	
	public Calculator () {
		
	}

	public Calculator(double value1, double value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public double getValue1() {
		return value1;
	}

	public void setValue1(double value1) {
		this.value1 = value1;
	}

	public double getValue2() {
		return value2;
	}

	public void setValue2(double value2) {
		this.value2 = value2;
	}
	
	public double sum (double value1, double value2) {
		return value1 + value2;
	}
	
	public double subtraction (double value1, double value2) {
		return value1 - value2;
	}
	
	public double multiplication (double value1, double value2) {
		return value1 * value2;
	}
	
	public double division (double value1, double value2) {
		return value1 / value2;
	}
}
