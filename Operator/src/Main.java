/**An operator is a symbol or a set of symbols that represents a specific
 * operation or action in java */
public class Main {
    public static void main(String[] args) {
        System.out.println("The first test:");
        System.out.println(10 % 3); //10 = 3*3 + 1
        System.out.println(10 % 2);
        System.out.println(10 / 2); //just takes the integer
        System.out.println(10.0 / 3);
        System.out.println(1.1 + 1.01);
        /*if a floating-point number participates a calculation
         *conclusion: the outcome may be inaccurate
         *this is why all finance companies don't use it */

        System.out.println("The second test:");
        int num1 = 10;
        double num2 = num1;
        System.out.println(num2);
        //implicit conversion: int >> double
        //in fact, it's to add some zero behind two's implement code
        byte num3 = 10, num4 = 10;
        System.out.println(num3 + num4); //byte >> int
        //if variable type below int, it will be converted to int automatically
        char cha1 = 'A';
        System.out.println(cha1); //char
        System.out.println(cha1 + 1); //char >> int
        //in ASCII value of 'A' is 65 and 'B' is 66
        double num5 = (double) num1;
        //explicit conversion: int >> double
        //it's to add or minus figure behind two's implement code
        //so this process could change the positive and negative value
        //such as 0000 0000 1100 1000 >> 1100 1000, namely short 200 >> byte -56
        System.out.println(num5);
        byte num6 = (byte)(num3 + num4); //byte >> int >> byte
        System.out.println(num6);

        System.out.println("The third test:");
        System.out.println("123" + 456);
        //when using a string, a single '+' becomes a string connector
        System.out.println(1 + 2 + "3");
        //when it has many '+', it will compute left to right
        //cause the first '+' between two figure, it means plus not connection
        //integer + integer + string >> integer + string >> string

        System.out.println("The fourth test:");
        num1 --; //10 - 1
        -- num1; //9 - 1
        System.out.println(num1); //8
        //'++' and ~ can be used when before or after the variable in single line
        int num7 = 0;
        num7 = num1 ++;
        //use first, add later
        System.out.println(num7); //8
        System.out.println(num1); //9
        num7 = ++ num1;
        //add first, use later
        System.out.println(num7); //10
        System.out.println(num1); //10

        System.out.println("The fifth test:"); //assignment operator
        int num8 = 2, num9 = 3;
        num8 += num9; //it's just like: num8 = num8 + num9, but shorter
        System.out.println(num8); //5
        num8 -= num9;
        System.out.println(num8); //2
        num9 /= num8;
        System.out.println(num9); //1
        num9 %= num8;
        System.out.println(num9); //1
        short num10 = 1;
        num10 += 1;
        //not similar with line 58, it's equal to: num10 = (short)(num10 + 1)
        //on the second test, we learned about implicit conversion
        //but this is some different, because it's includes an explicit conversion
        System.out.println(num10);

        System.out.println("The sixth test:"); //comparison operators
        boolean jud;
        jud = num8 == num9; //all outcomes are boolean, true or false
        System.out.println(jud);
        System.out.println(num8 >= num9);

        System.out.println("The seventh test:"); //logic operators
        System.out.println(true & true); //'&' means 'and'
        System.out.println(false & true);
        System.out.println(false & false);
        System.out.println(true | true); //'|' means 'or'
        System.out.println(false | true);
        System.out.println(false | false);
        System.out.println(false ^ true);
        //if both are different, it will be true, in addition it is named XOR
        System.out.println(!true); //'!' means 'not'
        System.out.println(!false);
        System.out.println(false && true);
        //the short-circuit evaluation can improve performance of program,
        //though the ultimate value can not be changed
        //if application find that the first value can define the outcome
        //it will be ended abruptly, and output directly
        //it's important to note that short-circuit only has two types && and ||
        //you can use assignment operator to verify it
        //the last but not least: we generally use '&&', '||' and '!'

        System.out.println("The eighth test:"); //ternary operators
        //the syntax: condition ? valueIfTrue : valueIfFalse;
        //a ternary operator must be used in program, as if not IDEA will have problem
        System.out.println(10 < 20 ? 1 : 2); //true
        System.out.println(10 > 20 ? 1 : 2); //false

        System.out.println("The tenth test:"); //logic operator in figure
        int num11 = 200, num12 = 10;
        System.out.println(num11 & num12);
        // num11 ~ 0000 1100 1000, namely 200
        // num12 ~ 0000 0000 1010, namely 10
        // outcome 0000 0000 1000, namely 8
        System.out.println(num11 | num12);
        // num11 ~ 0000 1100 1000, namely 200
        // num12 ~ 0000 0000 1010, namely 10
        // outcome 0000 1100 1000, namely 200
        System.out.println(num11 << 2);
        // shift left 2 bit, and add 0 in front
        // num11 ~ 0000 1100 1000, namely 200
        // outcome 0011 0010 0000, namely 800 = 200 * 2 * 2
        System.out.println(num12 >> 2);
        // shift right 2 bit, if it's a negative number, add 1 in front
        // num12 ~ 0000 0000 1010, namely 10
        // outcome 0000 0000 0010, namely 2
        System.out.println(num12 >>> 2);
        // no symbol shift right, add 0 in front whatever negative or positive
    }
}