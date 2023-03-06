package AmountConversion;

/**
 * Amount Conversion
 * translate number to Chinese upper number character
 * '万','仟','佰','拾'
 * '零','壹','贰','叁','肆','伍','陆','柒','捌','玖'
 * 8 digits
 */
public class Main {
    public static void main(String[] args) {
        int num = 114514;
        System.out.println(transToUpperNum(num));
    }

    public static String transToUpperNum(int num) {
        if(num >= 10000000){
            return "Oversized number!";
        }
        //initialize all the chinese upper numbers and the consult units
        char[] unit = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        char[] resultChar = {'仟', '仟', '佰', '佰', '拾', '拾', '万', '万',
                '仟', '仟', '佰', '佰', '拾', '拾', '元', '元'};
        //get all the num as to sequence
        for (int i = 0; i < 8; i++) {
            resultChar[resultChar.length - (i * 2 + 2)] = unit[num % 10];
            num /= 10;
        }
        //convert char to string and return
        String result = "";
        for (int i = 0; i < 16; i++) {
            result += resultChar[i];
        }
        return result;
    }
}
