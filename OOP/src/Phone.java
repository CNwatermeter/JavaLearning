/**Javabean class
 * only can have one public class
 * one file defines one class*/
public class Phone { //javabean class
    String brand; //property: variable
    private double price;
    private int key = 114514; //private made it only can be accessed in this class
    public void call(){ //behavior: method
        System.out.println("Calling");
    }
    public void playGame(){
        System.out.println("Playing games");
    }
    public void setPrice(double price){ //made price value more secure
        if (price >= 500 && price <= 10000){
            this.price = price; //member var = local var
        }else{
            System.out.println("No correct price!");
        }
    }
    public double getPrice(){
        return price;
    }
    int test = 1; //member variable
    public void test1(){
        int test = 2; //local variable
        System.out.println(test);
        //if two variable have same name
        //when we use it, who more near with variable definition, IDEA use who
    }
    public void test2(){
        int test = 3;
        System.out.println(this.test); //fore method use member variable
    }
}
