// ExamineNumbers2.java
// finds the average of a given sequence of numbers

import java.util.*;

public class ExamineNumbers2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.print("How many numbers in the sequence? ");
        int quantity = console.nextInt();

        int negatives = 0;
        double sum = 0;

        for (int i = 1; i <= quantity; i ++){
            System.out.print("#" + i + ": ");
            double next = console.nextDouble();
            sum += next;
            if (next < 0){
                negatives++;
            }
        }
        System.out.println();
        if (quantity <= 0){
            System.out.println("No numbers to average");
        }else{
            double average = sum / quantity;
            System.out.println("Average: " + average);
        }
        System.out.println("Number of negative numbers: " + negatives);
    }
}
