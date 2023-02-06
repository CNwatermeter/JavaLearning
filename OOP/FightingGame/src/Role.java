import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //function method//
    public void attack(Role role) {
        System.out.printf("%s attacked %s\n", this.getName(), role.getName());
        //all variable that don't use 'this' is the role variable
        //we can use this method receive all role's variable and method
        //role and this both are address
        Random r = new Random();
        int injury = r.nextInt(10) + 10;
        System.out.printf("%s -%sHP\n", role.getName(), injury);
        //give a random attack injury
        int remainBlood = role.getBlood() - injury;
        //remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);
    }


    //constructor//
    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }
}
