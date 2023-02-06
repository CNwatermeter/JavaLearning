public class Main {
    public static void main(String[] args) {
        Role r1 = new Role("Alpha", 100); //set role
        Role r2 = new Role("Beta", 100);
        while(true){
            r1.attack(r2);
            if (r2.getBlood() > 0) {
                //System.out.println(r2.getName() + " HP=" + r2.getBlood());
                System.out.printf("%s HP=%s\n", r2.getName(), r2.getBlood());
                //'%s' is a placeholder
                //'\n' is a line break
            } else {
                //System.out.println(r2.getName() + " is dead");
                System.out.printf("%s is dead", r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() > 0) {
                System.out.printf("%s HP=%s\n", r1.getName(), r1.getBlood());
            }else{
                System.out.printf("%s is dead", r1.getName());
                break;
            }
        }
    }
}