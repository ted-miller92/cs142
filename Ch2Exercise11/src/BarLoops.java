/*
Theodore Miller
Assignment 2 - Ch2 Exercise 11
This class prints two lines
One line prints a "|" character over the 0 in the following line, 
which counts up to a value given by the const RANGE.
This pattern is repeated a number of times given by the const REPS
*/

public class BarLoops {
	public static final int REPS = 8;	// set repetitions (outer loop)
	public static final int RANGE = 9;	// set length of string (inner loop)
	
	public static void main(String[] args) {
		
		String bars = "";
		String numbers = "";
		
		for (int i = 1; i <= REPS; i++) {
			for (int k = 1; k <= RANGE; k++) {
				numbers += k;
				bars += " ";
			}
			bars += "|";
			numbers += "0";
		}
		System.out.println(bars);
		System.out.println(numbers);
	}
}