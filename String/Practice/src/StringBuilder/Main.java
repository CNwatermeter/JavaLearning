package StringBuilder;

/**
 * StringBuilder
 * StringBuilder can be understood as a container
 * and the content inside can be changed
 * <p>
 * API: public StringBuilder()
 *      create a blank String object
 * API: public StringBuilder(String str)
 *      create a String object
 * API: public StringBuilder append()
 *      add value and return object itself
 * API: public StringBuilder reverse()
 *      reverse content of container
 * API: public int length()
 *      return the length
 * API: public String toString()
 *      convert StringBuilder to String
 */

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ABCDEFG");
        System.out.println(sb);
        //if we print directly we will get the property but not the address
        sb = sb.append("HIJK");
        System.out.println(sb);

        sb = sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());

        String str = sb.toString();
        System.out.println(str);
    }
}
