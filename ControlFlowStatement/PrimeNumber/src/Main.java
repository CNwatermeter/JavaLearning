/**Prime Number
 * get 1 million prime number
 * the initial method is to determine the range of 2 to the number we determine
 * but once the number is too large, it will consume more time to compute it
 * in the former exercise, we found that we can use square root to reduce quality of
 * calculation
 * so, in this execution, we use this method to get the prime number*/
public class Main {
    public static void main(String[] args) {
        int amount = 0; //counting
        for(int primeNum = 2; amount < 1000000 ; primeNum ++) {
            int squareRoot = 1;
            boolean sign = true; //a sign to determine whether it is a prime number
            for (; squareRoot * squareRoot <= primeNum; squareRoot ++);
            //get the square root
            for (int num = 2; num <= squareRoot - 1; num ++){ //determine 2 to square root
                if (primeNum % num == 0){ //if it's not a prime number
                    sign = false;
                    break;
                }
            }
            if (sign == true){
                //if it has passed all the detection, then it will be prime number
                System.out.println(primeNum);
                amount ++;
            }
        }
    }
}