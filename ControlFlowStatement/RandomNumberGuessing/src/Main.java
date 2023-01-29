import java.util.Random;
import java.util.Scanner;

/**Random Number Guessing
 * */
public class Main {
    public static void main(String[] args) {
        Random ranNum = new Random();
        int num1 = ranNum.nextInt(100); //rang: 0 ~ 99
        num1 ++; //range: 1 ~ 100
        System.out.println("Plz enter the number(1~100) you guess:");
        Scanner scaNum = new Scanner(System.in);
        while (true){
            int num2 = scaNum.nextInt();
            if (num2 < num1){
                System.out.println("Your number are too small! Enter again:");
            }else if (num2 > num1){
                System.out.println("Your number are too big! Enter again:");
            }else{
                System.out.println("You are right!");
                System.out.println("The number is " + num1);
            }
        }
    }
}