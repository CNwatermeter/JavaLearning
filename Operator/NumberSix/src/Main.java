import java.util.Scanner;

/**Number 6
 * input 2 integers on keyboard
 * if one is 6, output true
 * if sum of two numbers can be divisible by 6, output true
 * all the other cases are false*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Plz type the first integer:");
        Scanner numIn = new Scanner(System.in);
        int num1 = numIn.nextInt();
        System.out.println("Plz type the second integer:");
        int num2 = numIn.nextInt();
        //input two integers
        boolean judge; //define a variable
        judge = (num1 == 6) || (num2 == 6) || ((num1 + num2) % 6 == 0);
        //judgement, if one of three comparison is true, the ultimate value is true
        System.out.println(judge);
    }
}