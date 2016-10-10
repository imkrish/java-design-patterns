package structural_patterns.decorator;

/**
 * Created by imKrish on 9/10/16.
 */
public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return this.customSandwich.make() + this.addMeat();
    }

    private String addMeat() {
        return " + meat";
    }
}
