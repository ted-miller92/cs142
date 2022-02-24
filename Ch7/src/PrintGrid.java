
public class PrintGrid {


    public static void main(String[] args) {
        double[][] temps = new double[5][5];

        for (int i = 0; i < temps.length; i++) {
            for (int j = 0; j < temps[i].length; j++) {
                temps[i][j] = i * 5 + j + 1;
                System.out.print(temps[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
