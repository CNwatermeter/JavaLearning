package Phones;

import javax.xml.transform.Source;

public class Phones {
    public static void main(String[] args) {
        Phone[] arr = new Phone[4];
        Phone p1 = new Phone("Apple", 5999,"White");
        Phone p2 = new Phone("HUAWEI", 4999,"Blue");
        Phone p3 = new Phone("Mi", 3999,"Red");
        Phone p4 = new Phone("OPPO", 4599,"Yellow");
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = p4;

        int ave = 0;
        for (int i = 0; i < arr.length; i++) { //get average of price
            Phone phone = arr[i];
            ave += phone.getPrice();
        }
        ave /= arr.length;
        System.out.println("Average of price:" + ave);
        int count = 0; //how many phone cheaper than average
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            if (phone.getPrice() <= ave){
                count ++;
                System.out.printf("%s,%s,%s\n"
                        ,phone.getBrand(), phone.getPrice(),phone.getColor());
            }
        }
        System.out.println("There have " + count + " Phone cheaper that average");
    }
}
