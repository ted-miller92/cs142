import java.util.*;

public class RandomNumbersArray {
    public static void main(String[] args) {
        double[] list = buildRandomArray(5);

        System.out.println(printArrayContents(list));
    }

    public static double[] buildRandomArray(int size) {
        double[] data = new double[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = Math.floor(100 * Math.random());
        }
        return data;
    }

    public static String printArrayContents(double[] array) {
        String arrayContents = "";
        for (int i = 0; i < array.length; i++) {
            arrayContents += array[i] + ", ";
        }
        return arrayContents;
    }
}
