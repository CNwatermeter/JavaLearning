package Automobile;

import java.util.Scanner;

/**scanner
 * nex tInt();   get an integer
 * nextDouble(); get a decimal
 * next();       get a string
 * but if terminal has a space, \t or enter then it will stop
 * nextLine();   get a string
 * it can receive space and \t
 * BUT: these two systems can not be blended*/
public class Automobile {
    public static void main(String[] args) {
        Cars[] arr = new Cars[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Cars c = new Cars();
            //if this line isn't in loop, then three array are same
            //because they use a same address
            System.out.println("Enter the brand:");
            String brand = sc.next(); //get a string
            //if we use 'nextLine', only the first string line can be received
            //because these two systems can not be blended
            //using next.Int() at first will cause nextLine() can not receive data
            //if we enter: 123 + 'enter'
            //next.Int() gets the integer 123, nextLine() gets the 'enter'
            c.setBrand(brand);
            System.out.println("Enter the price:");
            int price = sc.nextInt(); //get an integer
            c.setPrice(price);
            System.out.println("Enter the color:");
            String color = sc.next(); //get a string
            c.setColor(color);
            arr[i] = c;
            //add object to array
        }
        for (int i = 0; i < arr.length; i++) {
            Cars c = arr[i];
            System.out.printf("%s,%s,%s\n", c.getBrand(), c.getPrice(), c.getColor());
        }
    }
}
