import java.util.Scanner;
/**Merchandise Payment
 * considering a customer is buying in shop
 * gross price is $600
 * type an integer representing the amount of the payment
 * if the money is enough, payment success*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Type the amount of the payment:");
        Scanner scaNum = new Scanner(System.in);
        int payNum = scaNum.nextInt();
        if(payNum >= 800){
            System.out.println("Payment success!");
        }else{
            System.out.println("Payment fail!");
        }
        if(payNum % 2 != 0){
            System.out.println("And the number is an odd!");
        }else{
            System.out.println("And the number is an even!");
        }
    }
}