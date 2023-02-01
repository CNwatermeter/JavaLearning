import java.util.Scanner;
/**Buy Plane Tickets
 * considering low and high season, first and economy class
 * a plane ticket will give different price in different discount
 * enter the original price, month and class
 * then print the actual prince
 * in high season: first class has 10% off, economy class has 15% off
 * in low season: first class has 30% off, economy class have 35% off*/
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the original ticket price: ");
        int ori = sca.nextInt();
        System.out.println("Enter the month:(1~12) ");
        int mon = sca.nextInt();
        System.out.println("Whether it is first class?(True or false)");
        boolean cla = sca.nextBoolean();
        //give the original condition
        if (5 <= mon && mon <= 10){ //high season
            ori = getPri(ori, cla, 0.9, 0.85); //command + P
            //control + option + M
            //abstract a method from code automatically
        }else{ //low season
            ori = getPri(ori, cla, 0.7, 0.65);
        }
        System.out.println("The ultimate price is " + ori);
    }
    private static int getPri(int ori, boolean cla, double discount1, double discount2) {
        if (cla == true){
            ori *= discount1;
            //ori = (int)(ori * discount);
            //if we use this form, we have to use a forced conversed
        }else if (cla == false){
            ori *= discount2;
        }
        return ori;
    }
}