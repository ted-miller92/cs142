import java.io.*; // for file reader
import java.util.*;

public class FileReading1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("test.txt"));

        int count = 0;
        while (input.hasNext()){
            String word = input.next();
            count++;
        }
        System.out.println("Total words: " + count);
    }
}
