import java.util.Scanner;

/**Control flow statement
 * Conditional statements (if-else, switch-case)
 * Loops (for, while, do-while)
 * Jump statements (break, continue, return) */
public class Main {
    public static void main(String[] args) {
        /*Conditional statements*/
        System.out.println("Whether the number you type is bigger than 10?");
        Scanner scaNum = new Scanner(System.in);
        int num1 = 9;//scaNum.nextInt();
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
        switch (num1){
            case 1,2,3,4,5 -> System.out.println("1~5"); //use comma to choose several num
            case 6,7,8,9,10 -> System.out.println("6~10");
        }

        /*Loops*/
        for(int num2 = 1; num2 <= 5; num2++){ //use num2 to control loops' times
            System.out.println("HelloWorld!");
        }
        System.out.println("-----");
        for(int num2 = 1; num2 <= 5; num2++){ //print 1~5
            System.out.println(num2);
        }
        System.out.println("-----");
        for(int num2 = 5; num2 >= 1; num2--){ //print 5~1
            System.out.println(num2);
        }
        num1 = 0; //a variable is effective only in its brace
        for(int num2 = 1; num2 <= 5; num2++){
            num1 += num2;
            if(num2 == 5)System.out.println(num1);
        }
        System.out.println("-----");
        { /*sum of odds in 1~100*/
            num1 = 0;
            int num2 = 1;
            for (; num2 <= 100; num2++) {
                if (num2 % 2 == 0) num1 += num2;
            }
            System.out.println(num1);
        }
        { /*sum of odds in 1~100*/
            num1 = 0;
            int num2 = 1;
            while (num2 <= 100) {
                if (num2 % 2 == 0) num1 += num2;
                num2++;
            }
            System.out.println(num1);
        }
        //for and while both are identical in use
        //but if you know how many loops you need, usually use for
        //in opposite, usually use while

        /*Jump statements*/
        //infinite loops:
        //for (;;){}
        //while (true){}
        //do{}while (true)
        //if we use infinite loops, we need to set a jump statements to break out
        for (int num3 = 1; num3 <= 5; num3 ++){
            if(num3 == 3){
                continue; //close this loop, and continue the next loop
            }
            System.out.println("Number: " + num3);
        }
        for (int num3 = 1; num3 <= 5; num3 ++){
            if(num3 == 3){
                break; //close the whole loop
            }
            System.out.println("Number: " + num3);
        }
        System.out.println("Test statement 'return':");
        for (int num3 = 1; num3 <= 5; num3 ++){
            if(num3 == 3){
                return; //close the whole loop
            }
            System.out.println("Number: " + num3);
        }
    }
}