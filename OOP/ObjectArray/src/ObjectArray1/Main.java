package ObjectArray1;
public class Main {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("114514","iPhone15Pro",8999,10);
        Goods g2 = new Goods("114515","Mate60Pro",7999,15);
        Goods g3 = new Goods("114516","Mi15Ultra",5999,20);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            //Object array traversal
            Goods goods = arr[i];
            System.out.println("ID " + goods.getId());
            System.out.println("Name " + goods.getName());
            System.out.println("Price " + goods.getPrice());
            System.out.println("Count " + goods.getCount());
            System.out.println();
        }
    }
}