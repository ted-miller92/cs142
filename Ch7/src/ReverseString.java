import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        int list[] = buildRandomArray(13);
        System.out.println(printArrayContents(list));

        for (int i = 0; i < list.length / 2; i++) {
            int j = list.length - i - 1;
            swap(list, i, j);
        }
        System.out.println(printArrayContents(list));

    }

    public static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static int[] buildRandomArray(int size) {
        int[] data = new int[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) Math.floor(100 * Math.random());
        }
        return data;
    }

    public static String printArrayContents(int[] array) {
        String arrayContents = "";
        arrayContents += array[0];
        for (int i = 1; i < array.length; i++) {
            arrayContents += ", " + array[i];
        }
        return arrayContents;
    }
}
