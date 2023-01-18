import java.util.Scanner;

/**Numerical Splitting
 * to split the income number and screen it */
public class Main {
    public static void main(String[] args) {
        System.out.println("Plz input a integer between 1000~9999:");
        Scanner scaNum = new Scanner(System.in);
        int priNum = scaNum.nextInt();
        System.out.println("The first  number:" + (priNum / 1000 % 10));
        System.out.println("The second number:" + (priNum / 100 % 10));
        System.out.println("The third  number:" + (priNum / 10 % 10));
        System.out.println("The fourth number:" + (priNum % 10));
        //there is a formula: 10^i / 10^i % 10
    }
}