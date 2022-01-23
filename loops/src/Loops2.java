
public class Loops2 {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			String s1 = "";
			for (int j = i; j >= 0; j--) {
				s1 += "*";
			}
			System.out.println(s1);
		}
	}
}