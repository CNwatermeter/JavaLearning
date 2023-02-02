/**
 * Two dimension Array
 * when we want manage many group data, we can use 2 dimension array
 */
public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                //using this form make array easy to read
                //it actually are 3 1 dimension arrays be stored in memory
                //so if we just print arr[0], IDEA will print the address of first array
                {11, 12, 13},
                {21, 22, 23},
                {31, 32,   },
        };
        //System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) { //use two loop to travel throughout it
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //dynamic initialization
        //int[][] arr = new int[m][n]
        //m == how many array we shall initiate
        //n == how many value in one array we shall initiate
        //we only can define a rectangular 2D array
        int[][] arr2 = new int[3][];
        int[] arr3 = {11};
        int[] arr4 = {21, 22};
        int[] arr5 = {31, 32, 33};
        arr2[0] = arr3; //arr[0][] actually store a address, so we can use this feature
        arr2[1] = arr4;
        arr2[2] = arr5;
        //more flexible but complex
        for (int i = 0; i < arr2.length; i++) { //use two loop to travel throughout it
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}