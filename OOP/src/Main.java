public class Main { //test class
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Phone p = new Phone(); //create a object
        p.brand = "Apple"; //assign a value
        p.price = 5999;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.playGame();
    }
}