public class Main {
    public static void main(String[] args) { //test class
        Phone p = new Phone(); //create a object
        p.brand = "Apple"; //assign a value
        p.setPrice(5999);
        System.out.println(p.brand);
        System.out.println(p.getPrice());
        p.call();
        p.playGame();
        p.test1(); //use local variable
        p.test2(); //use member variable

        Student s = new Student("Vincent", 24);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}