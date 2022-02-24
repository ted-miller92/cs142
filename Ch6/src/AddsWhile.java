import java.io.*;
import java.util.*;

public class AddsWhile {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("numbers.dat"));

        double sum = 0.0;
        int count = 0;

        while (input.hasNext()){
            double next = input.nextDouble();
            count++;
            System.out.println("Number " + count + " is " + next);
            sum += next;
        }
        System.out.println("Sum: " + sum);
    }
}
