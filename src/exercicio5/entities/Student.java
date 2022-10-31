package exercicio5.entities;

import java.util.Arrays;

public class Student {
	
	String name;
	double[] score;
	Discipline discipline;
	
	public Student () {
		
	}

	public Student(String name, double[] score, Discipline discipline) {
		this.name = name;
		this.score = score;
		this.discipline = discipline;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double[] getScore() {
		return score;
	}

	public void setScore(double[] score) {
		this.score = score;
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}
	
	public void showScores(double[] score) {
		for (int i = 0; i < score.length; i++) {
			if (i < 2) {
				System.out.printf("Test %d: %.2f%n", i + 1, score[i]);
			} else {
				System.out.printf("Homework: %.2f%n", score[i]);
			}	
		}
	}
	
	public double average(double[] score, double[] weight) {
		double accumulator = 0;
		for (int i = 0; i < score.length; i++) {
			accumulator += score[i] * weight[i];
		}
		return accumulator / Arrays.stream(weight).sum();
	}
	
	public double finalTest (double[] score, double[] weight) {
		return (average(score, weight) >= 3 && 
				average(score, weight) <= 6.6) ? 7 - average(score, weight) : 0;
	}
	
	public String approval(double[] score, double[] weight) {
		double result = finalTest (score, weight);
		if (average(score, weight) >= 6.6) {
			return String.format("Status: Approved");
		} else if (average(score, weight) >= 3 && average(score, weight) < 6.6) {
			return String.format("Status: In recovery | Minimum required for approval: %.1f", result);
		} else {
			return String.format("Status: Not approved");
		}
	}
}
