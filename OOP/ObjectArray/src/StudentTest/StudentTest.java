package StudentTest;

/**
 *
 */
public class StudentTest {
    public static void main(String[] args) {
        //initialization
        Student[] arr = new Student[3];
        Student s1 = new Student(001, "A", 18);
        Student s2 = new Student(002, "B", 17);
        Student s3 = new Student(003, "C", 19);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        Student s4 = new Student(001, "D", 20);
        //add information
        int s5 = 005;
        //delete information
        int s6 = 002;
        //fix information

        int index = getIndex(arr, s5);
        if (index != -1) {
            arr[index] = null;
        } else {
            System.out.println("Student can not be found!");
        }

        int index2 = getIndex(arr, s6);
        if (index2 != -1) {
            int age = arr[index2].getAge() + 1;
            arr[index2].setAge(age);
        } else {
            System.out.println("Student can not be found!");
        }

        boolean flag = researcher(arr, s4.getId());
        //whether s4 is in arr
        if (flag) {
            //if true, no operation
            System.out.println("Duplicate ID!");
            printArr(arr);
        } else {
            int count = getCount(arr); //get the real length
            if (count == arr.length) {
                //arr already filled, create a new arr but length + 1
                Student[] newArr = creatNewArr(arr);
                newArr[count] = s4;
                printArr(newArr);
            } else {
                //bring s4 to the null value location, but not allow sequence
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == null) {
                        arr[i] = s4;
                    }
                }
                //this method fixed bug that in learning video
                printArr(arr);
            }
        }
    }

    public static boolean researcher(Student[] arr, int id) {
        //judge whether s4 is in this arr
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            if (s == null) {
                continue;
            } //if there has a null, then IDEA will notice error
            int sid = s.getId();
            if (sid == id) {
                return true;
            }
        }
        return false;
    }

    public static int getCount(Student[] arr) {
        //get the real length
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static Student[] creatNewArr(Student[] arr) {
        //create a new arr that has one more length
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void printArr(Student[] arr) {
        //printing all the array values
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            if (arr[i] != null) {
                System.out.printf("%s,%s,%s\n", s.getId(), s.getName(), s.getAge());
            }
        }
    }

    public static int getIndex(Student[] arr, int s) {
        //get the array index of student
        for (int i = 0; i < arr.length; i++) {
            Student index = arr[i];
            if (index == null) {
                continue;
            }
            if (index.getId() == s) {
                return i;
            }
        }
        return -1; //can not be found
    }
}
