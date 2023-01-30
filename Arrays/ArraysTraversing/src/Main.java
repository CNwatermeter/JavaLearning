import java.util.Random;
/**Arrays Traversing
 * generate 100 random integer that's range is 1~100
 * get the num
 * get the average
 * statistic how many integer is lower than average*/
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        //because we know how many value we will store, so use dynamic initialization
        Random ranNum = new Random();
        for (int i = 0; i < arr.length; i++) { //store the random number
            arr[i] = ranNum.nextInt(100) + 1;
        }
        int sumNum = 0;
        for (int i = 0; i < arr.length; i++) { //get the sum
            sumNum += arr[i];
        }
        System.out.println("Sum: " + sumNum);
        int aveNum = sumNum / arr.length; //get the average
        System.out.println("Average: " + aveNum);
        int lowNum = 0;
        for (int i = 0; i < arr.length; i++) { //get the number that is lower than ave
            if (arr[i] < aveNum){
                lowNum ++;
            }
        }
        System.out.println("There are " + lowNum + " number lower than " + aveNum);
    }
}