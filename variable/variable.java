public class variable{
    /**a variable can be printed, modified and counted
       a variable can only store one value
       a variable can't be defined twice
       a single statement can define multiple variables
       a varibale must be assigned a value before it be used
       the scope of a variable is noteworthy and important */
    public static void main(String[] args){
        //int: stores a integer
        int integer1 = 100;
        //double: stores a floating-point number
        double floatingpointnumber1 = 3.14;
        //can be modified
        int integer2 = 200;
        integer2 = 300;
        //can be counted
        int integer3 = 400;
        integer3 = integer3 + integer2 + integer1;
        //single statement can define multiple variables
        int integer4 = 500, integer5 = 600, integer6;
        integer6 = 700; //can be but not elegant
        //printing test
        System.out.println(integer1); // 100
        System.out.println(integer2); // 300
        System.out.println(integer3); // 800
        System.out.println(integer1+integer2+integer3); //1200
        System.out.println(integer4+integer5+integer6); // 1800
        System.out.println(floatingpointnumber1);
    }
}