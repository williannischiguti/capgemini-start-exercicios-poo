package exercicio13.entities;

public class ScientificCalculator extends Calculator {

	public ScientificCalculator () {
		
	}

	public ScientificCalculator(double value1, double value2) {
		super(value1, value2);
	}
	
	public double squareRoot (double value1) {
		return Math.sqrt(value1);
	}
	
	public double power (double value1, double value2) {
		return Math.pow(value1, value2);
	}
	
}
