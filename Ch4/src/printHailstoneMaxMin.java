public class printHailstoneMaxMin {
    public static void main(String[] args){
        printHailstoneMaxMin(30 , 20);
    }
    public static void printHailstoneMaxMin(int value, int length){
        int min = value;
        int max = value;

        for (int i = 1; i <= length - 1; i++){
            if (value % 2 == 0){
                value = value / 2;
            } else {
                value = 3 * value + 1;
            }
            if (value > max){
                max = value;
            }else if (value < min){
                min = value;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}