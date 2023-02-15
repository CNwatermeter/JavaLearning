import java.util.Scanner;

/**API & String
 * API: Application Programming Interface
 * Java API such as: Scanner & Random
 * we do not have to recite API, but have to know how to use it
 * java provides a help document(.CHM) about java API
 * 'java.lang' is the most core package, so we don't have to import it
 * documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html
 * */
public class Main {
    public static void main(String[] args) {
        //API practice
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        //scans the next token of the input as a double
        System.out.println(num1);
        boolean flag = true;
        System.out.println("It's " + flag);
        //created a new string to blend two variable, but the first must be a string

        //java.lang.String
        //a string can not be modified
    }
}