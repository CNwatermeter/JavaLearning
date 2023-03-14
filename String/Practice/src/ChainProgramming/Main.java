package ChainProgramming;
/**Chain programming
 * A programming style that allows for complex operations
 * to be performed through a series of consecutive method calls.
 * Each method returns an object, which allows for further methods
 * to be called on the object without needing to reference it each time.
 * */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(getString().substring(1).length());
        StringBuilder sb = new StringBuilder();
        String str = sb.append("Aa").append("Bb").append("Cc").toString();
        System.out.println(str);
    }
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str = sc.next();
        return str;
    }
}
