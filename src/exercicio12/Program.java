package exercicio12;

import java.util.Locale;

import exercicio12.entities.Person;
import exercicio12.entities.Schedule;

public class Program {

	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		
		Person p = new Person();
		Schedule s = new Schedule();
		String names[] = {"Maria", "José", "Leandro", "Joana", "Mário",
						  "Luana", "Rodolfo", "Aline", "João", "Ana"};
		int ages[] = {17, 23, 25, 34, 39, 20, 51, 18, 32, 45};
		double heights[] = {1.60, 1.78, 1.80, 1.65, 1.67, 1.70, 1.90, 1.67, 1.77, 1.72};
		
		for (int i = 0; i < names.length; i++) {
			p = new Person(names[i], ages[i], heights[i]);
			s.addPerson(p);
		}
		
		System.out.println("List: ");
		System.out.println();
		s.printSchedule(s.getSchedule());
		
		System.out.println();

		System.out.println("Items deleted: "); 
		for (int i = 1; i <= 5; i++) {
			s.printPerson(s.getSchedule().get(i));
			s.removePerson(s.getSchedule().get(i));
		}

		System.out.println();
		System.out.println("Updated list:");
		System.out.println();
		s.printSchedule(s.getSchedule());
	}
}
