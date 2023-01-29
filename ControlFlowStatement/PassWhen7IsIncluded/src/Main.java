/**Pass When 7 Is Included
 * give a range of 1~100 integer
 * when a number include 7 or can be divided by 7
 * then print this integer*/
public class Main {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num ++){
            if(num % 10 == 7 || num / 10 % 10 == 7 || num % 7 == 0){
                //if a number have number 7 or if a number can be divided by 7
                System.out.println(num);
            }
        }
    }
}
