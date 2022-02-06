// This class determines whether a string begins AND ends with a capital letter

public class IsItCapital1 {

    public static void main(String[] args){
        boolean stringLength = capitalTest("Hello, bro bro");
        System.out.println(stringLength);
    }
    public static boolean capitalTest(String input){
        int strLength = input.length();
        char firstLetter = input.charAt(0);
        char lastLetter = input.charAt(strLength - 1);

        if (Character.isUpperCase(firstLetter) && Character.isUpperCase(lastLetter)){
            return true;
        }
        return false;
    }
}
