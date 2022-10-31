package exercicio17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicio17.entities.MaskGenerator;
import exercicio17.entities.Participant;
import exercicio17.entities.Scheduling;

public class Program {

	public static void main(String args[]) {
		
		Participant p = new Participant();
		Scheduling scheduling = new Scheduling();
		List<Scheduling> list = new ArrayList<Scheduling>();
		Scanner sc = new Scanner (System.in);
		//Participant(String name, String phone)
		//Scheduling(String schedulingType, String date, Participant participant)
		
		for (int i = 0; i < 5; i++) {
			p = new Participant("Person " + String.valueOf(i+1),MaskGenerator.generatePhoneNumber());
			scheduling = new Scheduling ("Reunion " + String.valueOf(i+1), MaskGenerator.generateDate(), p);
			list.add(scheduling);
		}
		
		Scheduling scheduling2 = scheduling.scheduleTask();
		list.add(scheduling2);
		
		scheduling.removeTasks(list);
		System.out.println();
		System.out.println("Searching by participant: Person 1");
		scheduling.searchByParticipant(list, "Person 1");
		System.out.println();
		System.out.print("Searching by date: ");
		System.out.println(list.get(1).getDate().substring(0, 10));
		System.out.println();
		scheduling.searchByDate(list, list.get(1).getDate().substring(0, 10));
		System.out.println();
		System.out.println("Updating data");
		scheduling.updateTask(list);
		
		sc.close();
	}
}
