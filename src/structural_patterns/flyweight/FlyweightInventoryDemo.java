package structural_patterns.flyweight;

/**
 * Created by imKrish on 10/10/16.
 */
public class FlyweightInventoryDemo {

    public static void main(String args[]) {

        InventorySystem ims = new InventorySystem();

        ims.takeOrder("Roomba", 211);
        ims.takeOrder("Samsung TV", 432);
        ims.takeOrder("Bose Headphones", 361);
        ims.takeOrder("Samsung TV", 431);
        ims.takeOrder("Samsung TV", 415);
        ims.takeOrder("Roomba", 666);
        ims.takeOrder("Samsung TV", 773);
        ims.takeOrder("Bose Headphones", 416);

        ims.process();

        System.out.println(ims.report());
    }
}
