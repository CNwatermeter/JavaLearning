import java.util.Scanner;
/**Encryption and Decryption
 * encryption method:
 * get each digit number, + 5, then % 10
 * in the end, reserve whole number*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your code to encrypt:");
        Scanner scaNum = new Scanner(System.in);
        int num1 = scaNum.nextInt(); //get the code
        System.out.println("Encryption code: " + encryption(num1));
        System.out.println("Enter your code to decrypt:");
        int num2 = scaNum.nextInt(); //get the encrypted code
        System.out.println("Decryption code: " + decryption(num2));
    }
    public  static int getLength(int num){ //get the length
        int length = 0;
        while (num > 0){
            num /= 10;
            length ++;
        }
        return length;
    }
    public static int encryption(int num){ //encryption
        int[] arr = new int[getLength(num)];
        for (int i = arr.length - 1; i >= 0; i--, num /= 10) { //get num in arr
            arr[i] = num % 10;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5; //process1
            arr[i] %= 10; //process2
        }
        int numReturn = 0; //process3
        for (int i = arr.length - 1; i >= 0; i--) {
            numReturn = numReturn * 10 + arr[i];
        }
        return numReturn;
    }
    public static int decryption(int num){ //decryption
        int num2 = 0, numLength = getLength(num);
        for (int i = 0; i < numLength; i++, num /= 10) { //reverse the num, process3
            num2 = (num2 * 10) + (num % 10);
        }
        int[] arr = new int[numLength]; //take the number into an array
        for (int i = arr.length - 1; i >= 0; i--, num2 /= 10) { //process1&2
            arr[i] = num2 % 10;
            if (arr[i] < 5){
                arr[i] = arr[i] + 10 - 5;
            }else{
                arr[i] -= 5;
            }
        }
        num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            num2 = num2 * 10 + arr[i];
        }
        return num2;
    }
}