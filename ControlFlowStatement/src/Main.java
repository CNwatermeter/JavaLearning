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

        switch(num1){ //switch-case, sequential execution
            case 9: //value behind case mustn't be a variable
                System.out.println("9");
                break;
                //break out, if you don't use break, program will execute sequentially
                //it may rouse some issue, so we use it generally
            case 10:
                System.out.println("10");
                break;
            case 11:
                System.out.println("11");
                break;
            default: //if none of these match, then execute default
                System.out.println("Not 9, 10 or 11");
                break;
        }
        switch (num1){ //new feature in JDK12+
            case 9 -> { //break out automatically
                System.out.println("9");
            }
            case 10 -> System.out.println("10"); //if only have one line code
            case 11 -> System.out.println("11");
            default -> System.out.println("Not 9, 10 or 11");
        }


    }
}