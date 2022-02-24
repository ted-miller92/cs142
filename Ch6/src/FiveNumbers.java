import java.io.*;
import java.util.*;

public class FiveNumbers {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("Ch6/numbers.dat"));

        double sum = 0.0;
        for (int i = 1; i <= 5; i++){
            double next = input.nextDouble();
            sum += next;
        }
        System.out.println("Sum: " + sum);
    }
}
