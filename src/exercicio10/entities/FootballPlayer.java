package exercicio10.entities;

import java.time.LocalDate;

public class FootballPlayer {

	private String name;
	private String position;
	private LocalDate birthDate;
	private int age;
	private String nationality;
	private double height;
	private double weight;
	
	public FootballPlayer () {
		
	}

	public FootballPlayer(String name, String position, LocalDate birthDate, int age, String nationality, double height,
			double weight) {
		this.name = name;
		this.position = position;
		this.birthDate = birthDate;
		this.age = age;
		this.nationality = nationality;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int playerAge(LocalDate dt) {
		LocalDate currentDate = LocalDate.now();
		int age = currentDate.compareTo(dt);
		return age;
	}
	
	public int calculateRetirement(int age, String position) {
		
		if (age >= 40 && position.compareToIgnoreCase("defender") == 0) {
			return 0;
		} else if (age >= 38 && position.compareToIgnoreCase("midfielder") == 0) {
			return 0;
		} else if (age >= 35 && position.compareToIgnoreCase("striker") == 0) {
			return 0;
		}
		
		
		if (position.compareToIgnoreCase("defender") == 0) {
			return 40 - age;
		} else if (position.compareToIgnoreCase("midfielder") == 0) {
			return 38 - age;
		} else if (position.compareToIgnoreCase("striker") == 0) {
			return 35 - age;
		} else {
			return 0;
		}
	}

	public String showPlayerData(FootballPlayer fPlayer) {
		return String.format("Player name: %s | position: %s | age: %d | nationality: %s | height: %.2f | weight: %.2f"
				+ " | retirement status: %s",
				fPlayer.getName(), fPlayer.getPosition(), fPlayer.getAge(), fPlayer.getNationality(),
				fPlayer.getHeight(), fPlayer.getWeight(), 
			   (fPlayer.calculateRetirement(fPlayer.getAge(), fPlayer.getPosition()) <= 0) ? "retired":
				String.valueOf(fPlayer.calculateRetirement(fPlayer.getAge(), fPlayer.getPosition()) + " year(s) remaining"));
	}
}
