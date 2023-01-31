import javax.xml.transform.Source;
import java.net.PortUnreachableException;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 9, 1, 4, 8, 3};

        Traversal(arr); //demo1

        System.out.println(Max(arr)); //demo2

        int num1 = 5, num2 = 6; //demo3
        System.out.println(num1 + "-->" + Judgement(arr, num1));
        System.out.println(num2 + "-->" + Judgement(arr, num2));

        Traversal(CopyOfRange(arr, 1, 5)); //demo4
        Traversal(CopyOfRange(arr, 9, 9));

        //memory structure
        System.out.println(arr[0]); //arr[0] == 1
        int[] arr2 = new int[arr.length];
        arr2 = arr; //namely give address of arr to arr2
        arr2[0] = 0; //so if we change the value of arr2
        System.out.println(arr[0]);
        //it actually changed the value of arr and arr2
        //the cause is they use same address considering stacks and heaps
        //if we change the value of arr in a method
        //the main's arr also be changed
        int num = 0;
        Memory(arr, num); //arr[0] -> 10, num -> 10
        System.out.println("arr[0]: " + arr[0]); //it is changed
        System.out.println("num: " + num); //it will not be changed
        //conclusion:
        //if formal parameter transmits a value, actual parameter will not be changed
        //but if formal parameter transmits an address, actual parameter will be changed
    }
    public static void Traversal(int[] arr){
        //traversal of arrays
        for (int i = 0; i < arr.length; i ++){ //arr.fori
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
    public static int Max(int[] arr){
        //get the max of arrays
        int max = arr[0];
        for (int i = 1; i < arr.length; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static boolean Judgement(int[] arr, int num){
        //judge a number whether in array
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == num){
                return true; //over the loop and method then return
            }
        }
        return false;
    }
    public static int[] CopyOfRange(int[] arr, int from, int to){
        //copy an array to new array, range is from 'from' to 'to'
        int[] arrReturn = new int[to - from + 1];
        for (int i = from, i2 = 0; i <= to; i ++, i2 ++) {
            arrReturn[i2] = arr[i];
        }
        return arrReturn;
    }
    public static void Memory(int[] arr, int num){
        arr[0] = 10;
        num = 10;
    }
}