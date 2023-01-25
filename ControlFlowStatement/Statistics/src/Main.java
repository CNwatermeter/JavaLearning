import java.util.Scanner;

/**Statistics
 * type two integers to express a range
 * count how many integers can be divided by 3 and 5*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Type a range");
        Scanner scaNum = new Scanner(System.in);
        System.out.println("The first integer:");
        int num1 = scaNum.nextInt();
        System.out.println("The second integer:");
        int num2 = scaNum.nextInt();
        if(num1 > num2){ //exchange to ensure num2 is bigger than num1
            int num = num1;
            num1 = num2;
            num2 = num;
        }
        int count = 0;
        for(int num3 = num1; num3 <= num2; num3 ++){
            if(num3 % 3 == 0 && num3 % 5 ==0)count++;
        }
        System.out.println("There are " + count + " integers can be divided by 3 & 5");
    }
}