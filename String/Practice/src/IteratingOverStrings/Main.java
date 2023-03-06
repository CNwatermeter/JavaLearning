package IteratingOverStrings;

import java.util.Scanner;

/**
 * Iterating Over A String
 * scan a string and iterate it
 * then give the static of upper case, lower case and number
 */
public class Main {
    public static void main(String[] args) {
        //scan an arr
        System.out.println("Please type a string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //String[] arr = {"1", "a", "A", "@"};

        int strLen = str.length();
        System.out.printf("There are %d characters.\n", strLen);
        System.out.println("All the characters are:");
        int upper = 0, lower = 0, num = 0;
        for (int i = 0; i < strLen; i++) { //str.length() can get the String's length
            char strChar = str.charAt(i);
            System.out.print(strChar + " ");
            //determine the letter
            if (strChar >= 'A' && strChar <= 'Z') {
                upper++;
            } else if (strChar >= 'a' && strChar <= 'z') {
                lower++;
            } else if (strChar >= '0' && strChar <= '9') {
                num++;
            }
        }
        System.out.println();
        System.out.printf("There are %d upper cases.\n", upper);
        System.out.printf("There are %d lower cases.\n", lower);
        System.out.printf("There are %d numbers.\n", num);
    }
}
