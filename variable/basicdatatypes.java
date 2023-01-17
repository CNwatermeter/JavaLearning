public class basicdatatypes{
    /**Integer types:
        byte: 8-bit signed integer
        short: 16-bit signed integer
        int: 32-bit signed integer
        long: 64-bit signed integer
     Floating-point types:
        float: 32-bit single-precision floating-point
        double: 64-bit double-precision floating-point
     Character type:
        char: 16-bit Unicode character
     Boolean type:
        boolean: can have the value of true or false */
     public static void main(String[] args){
         byte number1 = 10; //byte's value range is -128 to 127
         short number2 = 20;
         int number3 = 30;
         //if need a long type value, must add a alphabet 'L' or 'l' behind value
         long number4 = 40L;
         //just like 'long' but need alphabet 'F' or 'f'
         float number5 = 3.14F;
         double number6 = 6.28;
         char character1 = '爪';
         char character2 = '哇';
         //一眼顶针，鉴定为真
         boolean condition = true;
         //printing test
         System.out.println(number1);
         System.out.println(number2);
         System.out.println(number3);
         System.out.println(number4);
         System.out.println(number5);
         System.out.println(number6);
         System.out.println(character1);
         System.out.println(character2);
         System.out.println(condition);
     }
}