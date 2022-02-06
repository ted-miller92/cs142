public class PrintPyramid1 {
    public static void main(String[] args) {
        for (int j = 1; j <= 5; j++) {
            for (int k = 5 - j; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int l = 0; l < j; l ++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
