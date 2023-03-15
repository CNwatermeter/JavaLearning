package AdjustmentString;

import java.util.Arrays;

/**
 * Adjustment String
 * given two Strings A and B
 * replace the most left character to the right
 * if we use this method we can from A to get B
 * then return false
 * case: abcd -> bcda -> cdab -> dabc -> abcd
 */

public class Main {
    public static void main(String[] args) {
        String strA = "abcdefj", strB = "jabcdef", strC = "abcefd";

        System.out.println(ReverseStr(strA, strB));
        System.out.println(ReverseStr(strA, strC));

        System.out.println(ReverseStrArr(strA, strB));
        System.out.println(ReverseStrArr(strA, strC));

    }

    public static boolean ReverseStr(String strA, String strB) { 
        StringBuilder sb = new StringBuilder(strA);
        for (int i = 0; i < strA.length(); i++) {
            //append one on left to right, and delete one on left
            //but this method will consume more memory
            sb = sb.append(sb.charAt(0)).deleteCharAt(0);
            if (sb.toString().equals(strB)) {
                return true;
            }
        }
        return false;
    }

    public static boolean ReverseStrArr(String strA, String strB) {
        //convert String to char array
        char[] arrA = strA.toCharArray();
        char[] arrB = strB.toCharArray();
        //double loops
        for (int j = 0; j < strA.length(); j++) {
            char c = arrA[0];
            for (int i = 0; i < strA.length() - 1; i++) {
                arrA[i] = arrA[i + 1];
            }
            arrA[strA.length() - 1] = c;
            //judgement
            if (Arrays.equals(arrA, arrB)) {
                return true;
            }
        }
        return false;
    }
}
