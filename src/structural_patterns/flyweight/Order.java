package structural_patterns.flyweight;

/**
 * Created by imKrish on 10/10/16.
 */
public class Order {

    // Context

    private final int orderNumber;
    private final Item item;

    Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOrder() {
        System.out.println("Ordering " + item + " for order number " + orderNumber);
    }
}
