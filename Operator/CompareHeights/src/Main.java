import java.util.Scanner;

/**Compare Heights
 * input 3 heights on keyboard
 * compare them and put the highest height out on screen*/
public class Main {
    public static void main(String[] args) {
        Scanner heightIn = new Scanner(System.in);
        System.out.println("Plz type the first height:");
        int height1 = heightIn.nextInt();
        System.out.println("Plz type the second height:");
        int height2 = heightIn.nextInt();
        System.out.println("Plz type the third height:");
        int height3 = heightIn.nextInt();
        height1 = height1 > height2 ? height1 : height2;
        //compare height1 with height2
        height1 = height1 > height3 ? height1 : height3;
        //compare highest of 1 and 2 with height3
        System.out.println("The highest height:");
        System.out.println(height1);
    }
}