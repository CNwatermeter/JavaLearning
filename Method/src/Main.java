import java.util.Scanner;

/**A method in Java is a block of code that performs a specific task. Methods are used to
 * encapsulate a group of statements that perform a related function, making the code
 * easier to read, understand, and maintain.
 * Method is the smallest executable unit in java, just like function in C */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MethodDemo1(); //call a method
        Scanner scaNum = new Scanner(System.in);
        System.out.println("Enter two integers to get sum: ");
        int num1 = scaNum.nextInt();
        System.out.println("Another integer: ");
        int num2 = scaNum.nextInt();
        SumAndPrint(num1, num2);
        //the quantity and types of variable must be same
        //num1 and num2 in there are actual parameters
    }
    public static void MethodDemo1(){ //define a method
        System.out.println("This is the first method demo!");
        MethodDemo2();
    }
    public static void MethodDemo2(){
        System.out.println("This is the second method demo!");
    }
    public static void SumAndPrint(int num1, int num2){
        //get two num, seek the sum and print it
        //num1 and num2 in this method are different to main method
        //and these two are named formal parameters
        num1 += num2;
        System.out.println("Sum: " + num1);
    }
}