public class ReverseString {
    public static void main(String[] args){
        reverse("Hello world");
    }
    public static String reverse(String phrase){
        String result = "";
        for (int i = 0; i < phrase.length(); i++){
            result = phrase.charAt(i) + result;
        }
        return result;
    }
}