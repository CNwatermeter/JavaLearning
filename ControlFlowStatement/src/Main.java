import java.util.Scanner;

/**Control flow statement
 * Conditional statements (if-else, switch-case)
 * Loops (for, while, do-while)
 * Jump statements (break, continue, return) */
public class Main {
    public static void main(String[] args) {
        System.out.println("Whether the number you type is bigger than 10?");
        Scanner scaNum = new Scanner(System.in);
        int num1 = scaNum.nextInt();
        if(num1 > 10){ //if true, then execute the code
            System.out.println("Yes.");
        }
        //you can use no curly braces when only have one line code
        //But you can't define a variable
        //because 'int a = 1' actually is 'int a' & 'a = 1'
        //it's two line code, so IDEA will tip error
        if(num1 > 10){ //choose one of two
            System.out.println("Yes.");
        }else{ //if false
            System.out.println("No.");
        }
        //sequential execution


    }
}