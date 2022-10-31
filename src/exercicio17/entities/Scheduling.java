package exercicio17.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scheduling {
	
	private String schedulingType;
	private String date;
	private Participant participant;
	private List<Scheduling> list = new ArrayList<Scheduling>();
	
	public Scheduling () {
		
	}

	public Scheduling(String schedulingType, String date, Participant participant) {
		this.schedulingType = schedulingType;
		this.date = date;
		this.participant = participant;
	}

	public String getSchedulingType() {
		return schedulingType;
	}

	public void setSchedulingType(String schedulingType) {
		this.schedulingType = schedulingType;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public List<Scheduling> getList() {
		return list;
	}

	public void setList(List<Scheduling> list) {
		this.list = list;
	}
	
	public Scheduling scheduleTask() {
		Participant p = new Participant("Person X", MaskGenerator.generatePhoneNumber());
		Scheduling scheduling = new Scheduling ("Reunion X", MaskGenerator.generateDate(), p);
		return scheduling;
	}
	
	public void showTasks(List<Scheduling> list) {
		int count = 1;
		for (Scheduling s : list) {
			System.out.println(count + " - " + s);
			count += 1;
		}
	}
	
	public void removeTasks(List<Scheduling> list) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		showTasks (list);
		System.out.println();
		System.out.print("Enter the task number to remove: ");
		int number = sc.nextInt();
		
		list.remove(number - 1);
		
		System.out.println("Task removed");
		System.out.println("Updated list:");
		showTasks (list);
	}
	
	public void searchByParticipant(List<Scheduling> list, String participant) {
		for (int i = 0; i < list.size(); i ++) {
			if (list.get(i).getParticipant().getName().compareToIgnoreCase(participant) == 0) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void searchByDate(List<Scheduling> list, String date) {
		for (int i = 0; i < list.size(); i ++) {
			if (list.get(i).getDate().substring(0, 10).compareTo(date) == 0) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void updateTask(List<Scheduling> list) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		showTasks(list);
		System.out.println();
		
		System.out.print("Enter the number of the task to update: ");
		int option = sc.nextInt();
		
		searchByParticipant(list, list.get(option-1).getParticipant().getName());
		System.out.println();
		System.out.print("Data to update (1 - Task | 2 - Date | 3 - Participant | 4 Phone): ");
		int data = sc.nextInt();
		sc.nextLine();
		
		if (data == 1) {
			System.out.print("New task data: ");
			list.get(option-1).setSchedulingType(sc.nextLine());
		} else if (data == 2) {
			System.out.print("New date: ");
			list.get(option-1).setDate(sc.nextLine());
		} else if (data == 3) {
			System.out.print("New participant name: ");
			list.get(option - 1).getParticipant().setName(sc.nextLine());
		} else if (data == 4) {
			System.out.print("New phone data: ");
			list.get(option - 1).getParticipant().setPhone(sc.nextLine());
		}
		
		System.out.println();
		System.out.println("Task updated");
		System.out.println("Updated list:");
		showTasks (list);	
	}
	
	@Override
	public String toString() {
		return "Task: " + schedulingType + " | Date: " + date + " | " + participant;
	}
}
