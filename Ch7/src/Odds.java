import java.util.*;

public class Odds {
	public static void main(String[] args) {
		
		int[] odds = tellMeTheOdds(-8, 18);
		
		System.out.println(Arrays.toString(odds));
	}
	public static int[] tellMeTheOdds(int lowerLimit, int upperLimit) {
		int range = upperLimit - lowerLimit;
		int[] odds = new int[range / 2];
		
		for (int i = 0; i < odds.length; i ++) {
			int j = i + lowerLimit;
			if (lowerLimit % 2 == 0) {
				odds[i] = j + 1 + i;
			}
			else {
				odds[i] = j + 2 * i;
			}
		}
		return odds;
	}
}
