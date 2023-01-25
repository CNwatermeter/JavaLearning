/**Everest Paper Folding
 * I have a 0.1mm thick paper
 * How many times do you need to fold it to the height of Mt. Everest?
 * (height of Mt. Everest is 8844430mm)*/
public class Main {
    public static void main(String[] args) {
        double paper = 0.1, everest = 8844430;
        int fold = 0;
        while(paper <= everest){
            paper *= 2;
            fold ++;
        }
        System.out.println("Need to fold " + fold + " times.");
    }
}