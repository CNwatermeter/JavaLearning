import java.util.Random;
/**Score
 * 6 masters each gives vocalist a score
 * range: 0 ~ 100
 * and the final score is the average but miss the max and min score*/
public class Main {
    public static void main(String[] args) {
        Random ranNum = new Random();
        int[] master = new int[6];
        for (int i = 0; i < master.length; i++) { //give all scores
            master[i] = ranNum.nextInt(101);
        }
        int max = getMax(master);
        int min = getMin(master);
        int sum = 0;
        for (int i = 0; i < master.length; i++) {
            sum += master[i];
        }
        sum = sum - max - min;
        int ave = (int)(sum / (master.length - 2));
        System.out.println(ave);
    }

    private static int getMin(int[] master) {
        int min = master[0];
        //shift + fn + F6
        //modify all name of this variable
        for (int i = 1; i < master.length; i++) {
            if (min > master[i]){
                min = master[i];
            }
        }
        return min;
    }
    private static int getMax(int[] master) {
        int max = master[0];
        for (int i = 1; i < master.length; i++) {
            if (max < master[i]){
                max = master[i];
            }
        }
        return max;
    }
}