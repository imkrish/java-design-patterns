package structural_patterns.decorator;

/**
 * Created by imKrish on 9/10/16.
 */
public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return this.customSandwich.make() + this.addDressing();
    }

    private String addDressing() {
        return " + dressing";
    }


}
