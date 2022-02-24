import java.util.*;

public class Temperature2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("How many days? ");
        int numDays = console.nextInt();
        int temps[] = new int[numDays];

        int sum = 0;
        for (int i = 0; i < numDays; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temps[i] = console.nextInt();
            sum += temps[i];

        }
        double avg = sum / numDays;
        System.out.println("Average: " + avg);


        System.out.println(tempsAbove(avg, temps));


    }

    // finds the number of days with a temp greater than average
    public static String tempsAbove(double avg, int[] temps) {
        int tempsAbove = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > avg) {
                tempsAbove++;
            }
        }
        return "Number of temps above average: " + tempsAbove;
    }
}
