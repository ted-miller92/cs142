import java.util.*;

public class Temperature1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many days' temperatures? ");

        int numDays = console.nextInt();
        int sum = 0;

        for (int i = 1; i <= numDays; i++) {
            System.out.print("Day " + i + "'s high temp: ");
            int next = console.nextInt();

            sum += next;
        }
        double average = (double) sum / numDays;
        System.out.println();
        System.out.println("Average for " + numDays + " days: " + average);

    }
}
