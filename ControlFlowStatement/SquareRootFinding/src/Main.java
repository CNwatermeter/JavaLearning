import java.util.Scanner;

/**Square Root Finding
 * enter an integer greater than 2
 * then return the number's square root
 * just retain the integer parts*/
public class Main {
    public static void main(String[] args) {
        System.out.println("plz enter an integer greater than 2:");
        Scanner scaNum = new Scanner(System.in);
        int num = scaNum.nextInt();
        int squareRoot = 1;
        while(squareRoot * squareRoot <= num){
            squareRoot ++;
        }
        System.out.println("Square root of " + num + " is " + (squareRoot - 1));
    }
}