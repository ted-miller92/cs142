public class MultiplicationTable {
    public static void main(String[] args){
        for (int i = 1; i <=10; i++){
            for (int j = 1; j <=10; j ++){
                System.out.printf("%3d", i * j);
            }
            for (int k = 9; k >=1; k--){
                System.out.printf("%3d", i * k);
            }
            System.out.println();
        }
        for (int l = 9; l >= 1; l --){

            for (int k = 1; k <=10; k++){
                System.out.printf("%3d", l * k);
            }
            for (int j = 9; j >=1; j--){
                System.out.printf("%3d", l * j);
            }
            System.out.println();
        }
    }
}
