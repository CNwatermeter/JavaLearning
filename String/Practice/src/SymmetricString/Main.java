package SymmetricString;

import java.util.Scanner;

/**Symmetric String
 * enter a String
 * judge whether it is a symmetric String and return Y or N
 * */

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(getString());
        if(sb.toString().equals(sb.reverse().toString())){ //concert to string and equal them
            System.out.println("It is a symmetric string!");
        }else{
            System.out.println("It is an asymmetric string!");
        }
    }
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str = sc.next();
        return str;
    }
}
