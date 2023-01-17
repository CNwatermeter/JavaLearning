/**the 'Scanner' class is a built-in class that allows you to read input from
 * various sources such as the keyboard, a file, or a network connection. */
import java.util.Scanner;
//a class must be imported before main program
public class scannerdemo{
    public static void main(String[] args){
        System.out.println("Plz type a number:");
        //give a clue to user
        Scanner number = new Scanner(System.in);
        //define a integer variable to store the value that scanner input
        int printing = number.nextInt();
        //give the value to another variable
        System.out.println(printing);
        //return the number user typed
    }
}