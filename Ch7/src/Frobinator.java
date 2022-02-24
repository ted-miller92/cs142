
public class Frobinator {
	public static void main(String[] args) {
		System.out.println(frobinator("Hello, world"));
	}
	public static String frobinator (String phrase){
	    String result = "";
	    for (int i = 0; i < phrase.length(); i++){
	        result = phrase.charAt(i) + result;
	    }
	    return result;
	}
}
