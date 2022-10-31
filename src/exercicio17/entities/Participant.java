package exercicio17.entities;

public class Participant {
	
	private String name;
	private String phone;
	
	public Participant() {
		
	}

	public Participant(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Participant: " + name + " | Phone number: " + phone;
	}
	
	
}
