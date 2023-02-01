import java.util.Random;
/**Verification Code
 * generate a random verification code
 * length: 5 digit
 * first 4 digit are alphabet, the last digit is a number */
public class Main {
    public static void main(String[] args) {
        Random radNum = new Random();
        char[] code = new char[5];
        for (int i = 0; i < code.length; i++) {
            if (i != code.length - 1){
                code[i] = getCode(radNum, true); //get letter code
            }else{
                code[i] = getCode(radNum, false); //get number code
            }
        }
        System.out.print("Your verification code: "); //printing
        for (int i = 0; i < code.length; i++) {
            System.out.print(code[i]);
        }
    }
    private static char getCode(Random radNum, boolean alphabet) {
        //ASCII 65~90,97~122 are all alphabet
        if (alphabet == true) { //give a letter
            int letter = radNum.nextInt(52);
            if (letter < 26) { //if true, then generate capital letter
                return (char) (letter + 65); //ASCII 65~90
            } else {
                return (char) (letter - 26 + 97); //ASCII 97~122
            }
        }else{ //give a number
            return (char)(radNum.nextInt(10) + 48); //ASCII 48~57
        }
    }
}