/**Find Prime number
 * to find how many prime number in range that from 101 to 200
 * and print all prime number*/
public class Main {
    public static void main(String[] args) {
        int amount = 0;
        for (int i = 101; i <= 200; i++) {
            if (judge(i) == true){
                amount ++;
                System.out.println(i);
            }
        }
        System.out.println("Range 101~200 have " + amount + " prime numbers.");
    }
    public static boolean judge(int num){ //judge whether it is a prime number
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}