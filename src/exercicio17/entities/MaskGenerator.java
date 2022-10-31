package exercicio17.entities;

public class MaskGenerator {
	
	public static String generatePhoneNumber() {
		return String.format("(%d) %d %d-%d",
				(int) (Math.random() * 10) + 10, 9, 
				(int) (Math.random() * 5) + 9000,
				(int) (Math.random() * 6) + 9000);
	}
	
	public static String generateDate() {
		return String.format("%d%d/%d%d/%d %d%d:%d%d",
				(int) (Math.random() * 3) + 0,
				(int) (Math.random() * 8) + 1,
				(int) (Math.random() * 1) + 0,
				(int) (Math.random() * 9) + 1,
				(int) (Math.random() * 2) + 2022,
				(int) (Math.random() * 1) + 1,
				(int) (Math.random() * 9) + 0,
				(int) (Math.random() * 0) + 0,
				(int) (Math.random() * 0) + 0);
	}
}
