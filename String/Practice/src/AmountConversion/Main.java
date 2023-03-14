package AmountConversion;

import java.util.Scanner;

/**
 * Amount Conversion
 * translate number to Chinese upper number character
 * '万','仟','佰','拾','元'
 * '零','壹','贰','叁','肆','伍','陆','柒','捌','玖'
 * 8 digits
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("Please enter an integer:");
            money = sc.nextInt();
            if (money >= 10000000 || money < 0) {
                System.out.println("Invalid number!");
            } else {
                System.out.println(getUpperNum(money)); //test1
                System.out.println(getUpperNum2(money)); //test2
                break; //need to notice where location of "break" is
            }
        }
    }

    public static String getUpperNum(int money) { //using char array
        //initialize all the chinese upper numbers and the consult units
        char[] unit = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        char[] resultChar = {'仟', '仟', '佰', '佰', '拾', '拾', '万', '万',
                '仟', '仟', '佰', '佰', '拾', '拾', '元', '元'};
        //get all the num as to sequence
        for (int i = 0; i < 8; i++) {
            resultChar[resultChar.length - (i * 2 + 2)] = unit[money % 10];
            money /= 10;
        }
        //convert char to string and return
        String result = "";
        for (int i = 0; i < 16; i++) {
            result += resultChar[i];
        }
        return result;
    }

    public static String getUpperNum2(int money) { //using string directly
        String moneyStr = "";
        String[] unit = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
        while (money != 0) {
            int digit = money % 10; //get the digit digit
            money /= 10;
            moneyStr = unit[digit] + moneyStr; //insert on the left
        }
        for (int i = 0, len = moneyStr.length(); i < 8 - len; i++) { //add zero number into result
            moneyStr = unit[0] + moneyStr;
        }
        String[] moneyUnit = {"仟", "佰", "拾", "万", "仟", "佰", "拾", "元" };
        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) { //splicing in order
            char c = moneyStr.charAt(i);
            result = result + c + moneyUnit[i];
        }
        return result;
    }
}
