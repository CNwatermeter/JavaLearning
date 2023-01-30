import javax.xml.transform.Source;
/**Array
 * A array is a data structure in programming that is used to store a collection of
 * elements, all of them is same data type. Each element in the array is stored at
 * a specific index or location, and can be accessed using that index.*/
public class Main {
    public static void main(String[] args) {
        //to define an array, we can use two form:
        //int[] array
        //int array[]
        //but we often use the first form
        int[] arr1 = new int[]{1, 2, 3, 4, 5}; //static initialization, complete form
        double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5}; //handy form
        //once an array is defined, the content also is fixed
        //so, both array1 and array2 are 3-long array
        System.out.println(arr1); //it will not print the value of array but print address
        //[I@5acf9800
        //'[' means it is an array
        //and 'I' means the variable type of array is integer
        //'5acf9800' is the real address in memory
        System.out.println(arr2);
        //'D' means the variable type of array is double
        System.out.println(arr1[0]); //index of array
        arr1[0] = 10; //we can also use it to change the value
        System.out.println(arr1[0]);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr1[i]); //print all of array's value
        }
        System.out.println("arr2's length: " + arr2.length); //get the length of array
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        } //traverse an array automatically: arrayName.fori
        int[] arr3 = new int[10];//dynamic initialization
        //when the array is declared with a specified size, use dynamic initialization
        /*For int arrays, the default value is 0
        * For double arrays, the default value is 0.0
        * For char arrays, the default value is '\u0000'
        * For boolean arrays, the default value is false
        * For reference arrays (e.g. Object arrays), the default value is null */
        System.out.println(arr3[5]);
        //if we just know how many value we will store, we use dynamic initialization
        //but if we already know all value of variable, we use static initialization


    }
}