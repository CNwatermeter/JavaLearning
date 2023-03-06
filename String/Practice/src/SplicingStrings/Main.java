package SplicingStrings;

/**
 * Splicing a string
 * define a method to achieve this feature
 * according a certain format print content of int array as string
 * format: [num1, num2, num3]
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 5, 1, 4};
        System.out.println(splicing(arr));
    }

    public static String splicing(int[] arr) {
        //determine whether arr is none sense or no value
        if (arr == null) {
            return "";
        } else if (arr.length == 0) {
            return "[]";
        }
        //using string's trait
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i < arr.length - 1) { //suit format
                result += ",";
            }
        }
        result += "]";
        //ultimately return
        return result;
    }
}
