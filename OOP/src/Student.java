/**Constructor
 * standard javabean:
 * 1.private member variable
 * 2.use proper class name
 * 3.give at least two constructor method
 * 4.member variable use method setXxx and getXxx */
public class Student {
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public Student(){
        //if we don't give a void variable constructor
        //IDEA will create it automatically
        System.out.println("Creat a void Student-class");
    }
    public Student(String name, int age){
        //parameterized constructor
        //if we write this, we must write a no-argument constructor
        this.name = name;
        this.age = age;
    }
    //in real programming,
    //we have to write both no-argument and parameterized constructor
}
