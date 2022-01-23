
public class Triangles {
	public static void main(String[] args) {
		System.out.println("Hypotenuse 1 = " + hypotenuse(5, 12));
		System.out.println("Hypotenuse 2 = " + hypotenuse(3, 4));
	}
	public static double hypotenuse(double a, double b) {
		return Math.sqrt(a * a + b * b);
	}
}
