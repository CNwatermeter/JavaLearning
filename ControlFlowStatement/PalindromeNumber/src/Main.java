import java.util.Scanner;
/**Palindrome Number
 * Determine if a number is a palindrome
 * It is an integer whose number looks the same from left to right
 * and from right to left*/
public class Main {
    public static void main(String[] args) {
        System.out.println("type an integer to judge if it is a palindrome num:");
        Scanner scaNum = new Scanner(System.in);
        int palNum = scaNum.nextInt(); //input
        int digit = 0, judgement = 1;
        for (int digNum = palNum; digNum > 0; digit ++){ //to get digit of the number
            digNum /= 10;
        }
        System.out.println(palNum + " is a number with " + digit + " digits");
        for (int judNum = 0; judNum < digit / 2; judNum ++){ // loop digit/2 times
            int midNum1 = palNum, midNum2 = palNum;
            for (int digit1 = digit - judNum - 1; digit1 > 0; digit1 --){
                midNum1 /= 10;
            }
            for (int digit2 = judNum; digit2 > 0; digit2 --){
                midNum1 %= 10;
                //to get the high digit number
                midNum2 /= 10;
            }
            for (int digit1 = digit - judNum - 1; digit1 > 0; digit1 --){
                midNum2 %= 10;
                //to get the low digit number
            }
            if(midNum1 != midNum2){ //determine the numbers are equal
                System.out.println("No.");
                judgement = 0;
                break; //don't have to judge jump out of the loop
            }
        }
        if (judgement == 1)System.out.println("Yes.");
        /*but this method is the most direct method, it is so complicated that
        does not suit for using, and it is hard to read. here is an easy method */
        int revNum = 0;
        for(int midNum = palNum; midNum > 0; midNum /= 10){
            revNum *= 10;
            revNum +=  midNum % 10;
        }
        if (revNum == palNum) System.out.println("Yes.");
        else System.out.println("No.");
        //the coarse thought is to reverse the integer and compare it and initial num
        //this method is shorter but can't determine single digit
    }
}

