package structural_patterns.flyweight;

/**
 * Created by imKrish on 10/10/16.
 */
public class Item {

    // Immutable - Concrete Flyweight

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
