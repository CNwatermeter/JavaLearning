package ReversingStrings;

import java.util.Scanner;

/**
 * Reversing A String
 * scan a string and reverse it
 */

public class Main {
    public static void main(String[] args) {
        //get the string
        System.out.println("Please type a string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //test
        System.out.println(reverseStr(str));
    }

    public static String reverseStr(String str) {
        //crate a new string and initialize it
        String result = "";
        //give character to result reversely
        for (int i = str.length() - 1; i >= 0; i--) { //str.length().forr
            result += str.charAt(i);
        }
        return result;
    }
}
