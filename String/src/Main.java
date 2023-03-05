import javax.sound.midi.SoundbankResource;
import java.util.Scanner;

/**
 * API & String
 * API: Application Programming Interface
 * Java API such as: Scanner & Random
 * we do not have to recite API, but have to know how to use it
 * java provides a help document(.CHM) about java API
 * 'java.lang' is the most core package, so we don't have to import it
 * documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html
 */
public class Main {
    public static void main(String[] args) {
        //API practice
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        //scans the next token of the input as a double
        System.out.println(num1);
        boolean flag = true;
        System.out.println("It's " + flag);
        //created a new string to blend two variable, if the first is a string

        //java.lang.String
        //a string can not be modified since it has been created
        //so code of line 20 actually created a new string

        //creating a method of string
        String s1 = "abc";
        System.out.println(s1);
        String s2 = new String(); //namely ""
        System.out.println("@" + s2 + "@");
        String s3 = new String("abcd"); // as same as line 31
        System.out.println(s3);

        char[] chs = {'a', 'b', 'c', 'd', 'e'};
        String s4 = new String(chs);
        System.out.println(s4);
        //create a new string storing contents of the chs array
        byte[] bys = {97, 98, 99}; // ASCII code to convert as character
        String s5 = new String(bys);
        System.out.println(s5);
        //these two method are more useful

        //if we use "" to assign, system will check whether this string
        //is in string table, if true, then give this address to string
        //this mechanism can save memories
        //but if we use 'new String' mechanism above will not exist
        String s6 = "abc";
        String s7 = new String("abc");
        String s8 = "abc";
        String s9 = new String("abc");
        System.out.println("s6 == s7: " + (s6 == s7)); //compare address
        System.out.println("s6 == s8: " + (s6 == s8));
        System.out.println("s7 == s9: " + (s9 == s7));

        //comparing contents of string, we can use:
        //boolean equals
        //boolean equalsIgnoreCase
        String s10 = "ABC";
        boolean result1 = s6.equals(s7); //abc == abc
        System.out.println(result1);
        boolean result2 = s6.equals(s10); //abc == ABC
        System.out.println(result2);
        boolean result3 = s6.equalsIgnoreCase(s10); //abc == ABC
        System.out.println(result3);

    }
}