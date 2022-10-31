package exercicio12.entities;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
	
	List<Person> schedule = new ArrayList<Person>();
	
	public Schedule() {
		
	}

	public List<Person> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Person> schedule) {
		this.schedule = schedule;
	}
	
	public void addPerson(Person p) {
		schedule.add(p);
	}
	
	public void removePerson(Person p) {
		schedule.remove(p);
	}
	
	public void printSchedule(List<Person> list) {
		for (Person p : list) {
			System.out.printf("Name: %s | Age: %d | Height: %.2f%n", p.getName(), p.getAge(), p.getHeight());
		}
	}
	
	public void printPerson (Person p) {
		System.out.printf("Name: %s | Age: %d | Height: %.2f%n", p.getName(), p.getAge(), p.getHeight());
	}
}
