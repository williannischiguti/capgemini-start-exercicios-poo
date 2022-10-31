package exercicio5;

import java.util.Locale;

import exercicio5.entities.Discipline;
import exercicio5.entities.Student;

public class Program {
	
	public static void main (String args []) {
		
		Locale.setDefault(Locale.US);
		String name = "Jhon";
		Discipline discipline = new Discipline("Math");
		double[] weight = {2.5, 2.5, 2};
		double[] scores = new double [weight.length];
		
		for (int i = 0; i < scores.length; i++) {
			double test = (Math.random()*10) + 1;
			scores[i] = (test < 10) ? test : 10;
		}
		
		Student student = new Student(name, scores, discipline);
		System.out.printf("Student: %s | Discipline: %s%n", student.getName(), discipline.getName());
		student.showScores(scores);
		System.out.printf("Average: %.1f%n", student.average(scores, weight));
		System.out.println();
		System.out.println(student.approval(scores, weight));
	}
}
