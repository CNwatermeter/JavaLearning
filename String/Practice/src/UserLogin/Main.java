package UserLogin;

import java.util.Scanner;

/**
 * User Log-in
 */
public class Main {
    public static void main(String[] args) {
        //initial info
        String userName = "admin";
        String userCode = "114514";
        Scanner sc = new Scanner(System.in);
        //judgement
        for (int i = 0; i < 3; i++) {
            System.out.println("UserName:");
            String userNameIn = sc.next(); //get name
            //Finds and returns the next complete token from this scanner.
            System.out.println("UserCode:");
            String userCodeIn = sc.next(); //get code

            if (userCodeIn.equals(userCode) && userNameIn.equals(userName)) {
                System.out.println("Sign in successfully!");
                break;
            } else if (i < 2) {
                System.out.println("You have only " + (2 - i) + " chances.");
            } else {
                System.out.println("Login failed!");
            }
        }
    }
}


