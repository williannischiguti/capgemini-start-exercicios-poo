package exercicio13;

import java.util.Locale;

import exercicio13.entities.Calculator;
import exercicio13.entities.ScientificCalculator;

public class Program {
	
	public static void main (String args []) {
		
		Locale.setDefault(Locale.US);
		Calculator calc = new Calculator();
		ScientificCalculator calc2 = new ScientificCalculator();
		
		double value1 = 9;
		double value2 = 3;
		
		System.out.printf("%.2f + %.2f = %.2f%n", value1, value2, calc.sum(value1, value2));
		System.out.printf("%.2f - %.2f = %.2f%n", value1, value2, calc.subtraction(value1, value2));
		System.out.printf("%.2f * %.2f = %.2f%n", value1, value2, calc.multiplication(value1, value2));
		System.out.printf("%.2f / %.2f = %.2f%n", value1, value2, calc.division(value1, value2));
		System.out.printf("Square root of %.2f = %.2f%n", value1, calc2.squareRoot(value1));
		System.out.printf("%.2f ^ %.2f = %.2f%n", value1, value2, calc2.power(value1, value2));
		
	}
}
