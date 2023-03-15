package RomanNumeral;

/**
 * Roman Numeral
 * enter a String
 * the String must be number and lower than 10
 * then concert the String to a Roman Numeral
 */

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String num = "" + i;
            System.out.print(toRoman(num, CheckStr(num)) + " ");
        } //output whole test loop

        String trueNum = "1140514";
        String falseNum = "1140514a";
        System.out.println("");
        System.out.println(toRoman(trueNum, CheckStr(trueNum)));
        System.out.println(toRoman(falseNum, CheckStr(falseNum)));
        //or we can define a separate method to check whether the String meets the requirement

        System.out.println(toRomanSwitch(trueNum, CheckStr(trueNum)));
        System.out.println(toRomanSwitch(falseNum, CheckStr(falseNum)));
    }

    public static String toRoman(String num, boolean flag) {
        if (flag == false) {
            return "ERROR!";
        }
        StringBuilder romanNum = new StringBuilder();
        String[] romanNumArr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        //store roman numeral, we also could use 'switch', see method toRomanSwitch
        for (int i = 0; i < num.length(); i++) {
            int index = (int) (num.charAt(i) - '0'); //get the real number int variable
            romanNum = romanNum.append(romanNumArr[index] + " ");
        }
        return romanNum.toString();
    }

    public static String toRomanSwitch(String num, boolean flag) {
        if (flag == false) {
            return "ERROR";
        }
        StringBuilder romanNum = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            String str = switch (num.charAt(i)) {
                //using switch judgement, we can compare char variable directly
                case '0' -> "";
                case '1' -> "I";
                case '2' -> "II";
                case '3' -> "III";
                case '4' -> "IV";
                case '5' -> "V";
                case '6' -> "VI";
                case '7' -> "VII";
                case '8' -> "VIII";
                case '9' -> "IX";
                default -> "";
            };
            romanNum = romanNum.append(str + " ");
        }
        return romanNum.toString();
    }

    public static boolean CheckStr(String num) {
        if (num.length() >= 10) { //lower than 10
            return false;
        }
        for (int i = 0; i < num.length(); i++) {
            char index = num.charAt(i); //get the real number int variable
            if (index > '9' || index < '0') { //only 0 to 9 namely number
                return false;
            }
        }
        return true;
    }
}
