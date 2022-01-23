
public class FormLetter {
	public static void main(String[] args) {
		letter("Phillip","Smith");
		letter("Ted", "Miller");
	}
	public static void letter(String first, String last) {
		System.out.println("Dear " + first + " " + last + ",");
	}
}
